package com.scau.beyondboy;
import com.alibaba.fastjson.JSON;
import com.scau.beyondboy.service.AritcleService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/18
 * Time: 9:44
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class AritcleTest
{
    private static Logger logger = Logger.getLogger(UserTest.class);
    //private ApplicationContext ac = null;
    @Resource
    private AritcleService aritcleService;
    @Test
    public void test1()
    {
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(aritcleService.getLimitFind(1,10)));
    }
    @Test
    public void test2()
    {
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(aritcleService.getGroudBy());
    }
    @Test
    public void test3()
    {
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(aritcleService.getCount());
    }
    @Test
    public void test4()
    {
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(aritcleService.getAll());
    }
}
