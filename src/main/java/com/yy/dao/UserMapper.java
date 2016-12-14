package com.yy.dao;

import com.yy.bean.User;

public interface UserMapper {
    /**
    * 根据主键删除纪录：     表 user
    **/
    int deleteByPrimaryKey(Integer id);

    /**
    * 根据主键插入纪录：     表 user
    **/
    int insert(User record);

    /**
    * 根据主键获取纪录：     表 user
    **/
    User selectByPrimaryKey(Integer id);

    /**
    * 根据主键更新纪录：     表 user
    **/
    int updateByPrimaryKey(User record);
    
}