package com.oracle.mapper;

import com.oracle.web.bean.Monster;
import com.oracle.web.bean.SubMonster;

import java.util.List;

public interface MonsterMapper {
   
    int deleteByPrimaryKey(Integer monsterId);

    int insert(Monster record);

    Monster selectByPrimaryKey(Integer monsterId);

    List<SubMonster> selectAll();

    int updateByPrimaryKey(Monster record);
    
    List<SubMonster> selectAllWithOneSQL();
    
    List<SubMonster> selectFY(int pageNow);
    
    int getCount();

	List<SubMonster> showAllPagehelper();
   
}