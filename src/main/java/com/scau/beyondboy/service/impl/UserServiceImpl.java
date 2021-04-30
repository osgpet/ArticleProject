package com.scau.beyondboy.service.impl;
import com.scau.beyondboy.dao.UserMapper;
import com.scau.beyondboy.model.User;
import com.scau.beyondboy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/16
 * Time: 14:30
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Resource
    private UserMapper userMapper;
    /*@Autowired
    @Qualifier("userMapper")
    public void setUserMapper(UserMapper userMapper)
    {
        this.userMapper = userMapper;
    }
    public UserMapper getUserMapper()
    {
        return this.userMapper;
    }*/

    @Override
    public User getUserById(int userId)
    {
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
