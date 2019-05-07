package com.oracle.web.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.oracle.web.bean.SubMonster;
import com.oracle.web.bean.pageBean;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class TestController {

	//注入一个Web
	
	@Autowired
	WebApplicationContext context;

	// 模拟发送请求

	MockMvc mvc;

	@Before
	public void init() {

		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testPage() throws Exception {

		MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/monsters/1")).andReturn();

		MockHttpServletRequest request = result.getRequest();
		
		pageBean<SubMonster> pb=(pageBean<SubMonster>) request.getAttribute("pb");
		
		System.out.println(pb);
		
		List<SubMonster> list = pb.getBeanList();
		
		for (SubMonster subMonster : list) {
			
			System.out.println(subMonster);
		}

	}

}
