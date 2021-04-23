package com.example.aop.service;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:31
 */
public interface AopService {
    void insert(String name,int age);
    void insert(String name);
    void insert(int age);
    void delete(String name);
    void update(String name,int age);
}
