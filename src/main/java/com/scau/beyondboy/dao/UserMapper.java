package com.scau.beyondboy.dao;

import com.scau.beyondboy.model.User;
import java.math.BigDecimal;

public interface UserMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}