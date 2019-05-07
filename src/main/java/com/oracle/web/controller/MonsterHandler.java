package com.oracle.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oracle.web.bean.Monster;
import com.oracle.web.bean.School;
import com.oracle.web.bean.SubMonster;
import com.oracle.web.bean.pageBean;
import com.oracle.web.service.MonsterService;
import com.oracle.web.service.SchoolService;

@Controller
@Scope(value = "prototype")
public class MonsterHandler {

	@Autowired
	private MonsterService monsterService;

	@Autowired
	private SchoolService schoolService;

//	@RequestMapping(value="/monsters",method=RequestMethod.GET)
//	 public String Monsters(HttpServletRequest request){
//	
//	 List<SubMonster> list=monsterService.list();
//	
//	 request.setAttribute("mList", list);
//	
//	 return "list";
//	 }

	@RequestMapping(value = "/addUI", method = RequestMethod.GET)
	public String addUI(HttpServletRequest request) {

		List<School> list = schoolService.list();

		request.setAttribute("sList", list);

		return "add";
	}

	@RequestMapping(value = "/monster", method = RequestMethod.POST)
	public String add(Monster monster) {

		monsterService.save(monster);

		return "redirect:/monsters/1";
	}

	@RequestMapping(value = "/monster/{monsterId}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("monsterId") Integer id) {

		Monster monster = new Monster();

		monster.setMonsterId(id);

		monsterService.delete(monster);

		return "redirect:/monsters/1";
	}

	@RequestMapping(value = "/monster/{monsterId}", method = RequestMethod.GET)
	public String updateUI(@PathVariable("monsterId") Integer id, HttpSession session) {
		
		Monster monster = monsterService.queryOneMonster(id);

		session.setAttribute("monster", monster);	
		
		List<School> slist = schoolService.list();

		session.setAttribute("slist", slist);

		return "redirect:/update.jsp";
	}

	@RequestMapping(value = "/monster", method = RequestMethod.PUT)
	public String update(Monster monster) {

		monsterService.update(monster);
		
		//System.out.println(monster);

		return "redirect:/monsters/1";
	}

	/*@RequestMapping(value="/monsters/{pageNow}",method=RequestMethod.GET)
	public String selectFY(@PathVariable(value="pageNow")Integer pageNow, HttpServletRequest request){
		
		pageBean<SubMonster> pb=new pageBean<SubMonster>();
		
		if (pageNow == null || pageNow < 1) {

			pageNow = 1;

		}
		
		pb.setPageSize(5);
		
		int pageNows=(pageNow-1)*pb.getPageSize();
		
		int i=monsterService.count();
		
		pb.setCounts(i);
		
		pb.setPageNow(pageNow);
		
		List<SubMonster> list=monsterService.showPage(pageNows);
		
		pb.setBeanList(list);
		
		request.setAttribute("pb", pb);
		
		return "list";
			
	}*/
	
	@RequestMapping(value="/monsters/{pageNow}",method=RequestMethod.GET)
	public String selectFY(@PathVariable(value="pageNow")Integer pageNow, HttpServletRequest request){
			
		if (pageNow == null || pageNow < 1) {

			pageNow = 1;

		}
		
		pageBean<SubMonster> pb=this.monsterService.showAllPagehelper(pageNow);
		
		request.setAttribute("pb", pb);
		
		return "list";
			
	}

}
