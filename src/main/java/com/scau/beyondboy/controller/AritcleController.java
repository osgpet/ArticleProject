package com.scau.beyondboy.controller;
import com.scau.beyondboy.model.Aritcle;
import com.scau.beyondboy.service.AritcleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/18
 * Time: 14:18
 */
@Controller
@RequestMapping("/aritcle")
public class AritcleController
{
    @Resource
    private AritcleService aritcleService;
    /*@RequestMapping("/show")
    public String show(HttpSession session)
    {
        session.setAttribute("articleList",aritcleService.getAll());
        return "showArticle";
    }*/
    @RequestMapping("/show")
    public String showAll()
    {
        return "showArticle";
    }
    @RequestMapping("/getAllArticle")
    @ResponseBody
    public List<Aritcle> getAllArticle()
    {
        return aritcleService.getAll();
    }
    @RequestMapping("/add")
    public String addArticle(Aritcle aritcle)
    {
        aritcleService.add(aritcle);
        return "redirect:/aritcle/show";
    }
    @RequestMapping(value = "/delete")
    public String deleteArticle(@RequestParam int articleId)
    {
        System.out.println("bookId = [" + articleId + "]");
        aritcleService.delete(articleId);
        return "redirect:/aritcle/show";
    }
    @RequestMapping("/page")
    public  String pageDisplay(HttpSession session,@Param("start")int start, @Param("end")int end)
    {
        session.setAttribute("pageList",aritcleService.getLimitFind(start,end));
        return "showAritcle";
    }
    @RequestMapping(value = "/addAritcle")
    public String addBook()
    {
        return "addAritcle";
    }
   /* @RequestMapping(value="/findhandler")
    public  String findHandle(@RequestParam String find,HttpSession session)
    {
        session.setAttribute("find",bookService.findBook(Integer.parseInt(find)));
        return "showabook";
    }*/
}
