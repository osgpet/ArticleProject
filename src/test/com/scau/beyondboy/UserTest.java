package com.scau.beyondboy;
import com.alibaba.fastjson.JSON;
import com.scau.beyondboy.model.User;
import com.scau.beyondboy.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/16
 * Time: 16:01
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest
{
    private static Logger logger = Logger.getLogger(UserTest.class);
    //private ApplicationContext ac = null;
    @Resource
    private UserService userService ;

	/*@Before
	public void before()
    {
		ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-mybatis.xml","classpath:spring.xml"});
		userService = (UserService) ac.getBean("userService");
	}*/

    @Test
    public void test1()
    {
        User user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}

