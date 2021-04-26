package com.example.mvc.user.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @programe: spring-family
 * @Description: 表现层
 * @Author: li shuai ming
 * @Create: 2021/4/23-16:32
 */
@Controller
@RequestMapping("user")
public class UserController {
  //基本配置bean注入
//  构造器注入
    /*public UserController() {
        System.out.println("controller init");
    }
*/
 /*   @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("userController handleRequest !");
        return new ModelAndView("sucess");
    }
}
*/
 //注解实现类路径关联
    @RequestMapping(value = "create.do")
    public ModelAndView create(@RequestParam String name){
        //System.out.println("userController login method!");
        System.out.println("String name:"+name);
       // System.out.println("int age:"+age);
        //System.out.println("int age:");
        return new ModelAndView("sucess");
    }

}