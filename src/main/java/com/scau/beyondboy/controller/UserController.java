package com.scau.beyondboy.controller;
import com.scau.beyondboy.model.User;
import com.scau.beyondboy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/16
 * Time: 13:37
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    @Resource
    private UserService userService;
    /*@Autowired
    @Qualifier("userService")
    public void setUserService(UserServiceImpl userService)
    {
        this.userService = userService;
    }
    public UserService getUserService()
    {
        return this.userService;
    }*/

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model)
    {
        int userId = Integer.parseInt(request.getParameter("id"));
       // BigDecimal id=new BigDecimal(userId);
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}

