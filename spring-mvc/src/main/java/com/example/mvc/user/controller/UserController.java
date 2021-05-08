package com.example.mvc.user.controller;


import com.example.mvc.user.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;
import java.util.Date;

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
        public String create(User entity ){

        /*
        *
        * 字符串 @RequestParam(required = false)String name ,
        * 整型  @RequestParam(value = "age",required = false,defaultValue ="10") int age
        * value  @RequestHeader(value = "user-agent") String agent
        * Double price BigDecimal
        * @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date birthday
        *  数组
        *
        * */

//        System.out.println("userController login method!");
//        System.out.println("String name:"+name);
//        System.out.println("int age:"+age);
//        System.out.println("agent:"+agent);
//          System.out.println(entity);
          return "sucess";
    }

    /*
    *  定时器
    * */
    //@Scheduled(cron = "0 * 10 * * ?")
    public void task(){
        System.out.println(LocalTime.now());
    }
}