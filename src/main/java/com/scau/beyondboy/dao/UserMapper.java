package com.scau.beyondboy.dao;

import com.scau.beyondboy.model.User;

import java.math.BigDecimal;
//@Repository("userMapper")
//@Transactional
public interface UserMapper
{
    int deleteByPrimaryKey(int id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}