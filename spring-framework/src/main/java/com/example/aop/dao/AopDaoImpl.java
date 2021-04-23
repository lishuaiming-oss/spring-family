package com.example.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:30
 */
@Repository
public class AopDaoImpl implements AopDao {
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
        System.out.println("AopDaoImpl delete()");
    }

    @Override
    public void update(String name, int age) {
        System.out.println("AopDaoImpl update()");
    }
}
