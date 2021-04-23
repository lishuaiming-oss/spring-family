package com.example.ioc2.dao;

/**
 * @programe: spring-family
 * @Description: dao接口
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:19
 */

public interface IocDao {
    void insert(String name,int age);
    void insert(String name);
    void insert(int age);
    void delete(String name);

}
