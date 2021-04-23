package com.example.ioc2.service;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:31
 */
public interface IocService {
    void insert(String name,int age);
    void insert(String name);
    void insert(int age);
    void delete(String name);

}
