package com.scau.beyondboy.service;
import com.scau.beyondboy.model.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/16
 * Time: 14:29
 */
public interface UserService
{
    public User getUserById(int userId);
}
