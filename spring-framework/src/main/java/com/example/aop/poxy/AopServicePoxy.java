package com.example.aop.poxy;

import com.example.aop.service.AopService;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/19-10:19
 */
public class AopServicePoxy implements AopService {
   private AopService aopService;

    public AopServicePoxy(AopService aopService) {
        this.aopService = aopService;
    }

    @Override
    public void insert(String name, int age) {

    }

    @Override
    public void insert(String name) {

    }

    @Override
    public void insert(int age) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name, int age) {
        System.out.println("-----1--------");
        aopService.update(name, age);
        System.out.println("------2-------");
    }
}
