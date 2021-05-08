package com.example.mvc.role.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/5/8-13:39
 */
@Controller
@RequestMapping("role")
public class RoleController {

    @RequestMapping("create1.do")
    public String create1(){
        System.out.println("RoleController create1 method!");
        return "forward:/role/create2.do";
    }
    @RequestMapping("create2.do")
    public String create2(){
        System.out.println("RoleController create2 method!");
        return "sucess";
    }
}
