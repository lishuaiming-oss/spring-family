package com.example.aop.service.impl;

import com.example.aop.dao.AopDao;
import com.example.aop.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:32
 */
@Service
public class AopServiceImpl implements AopService {
    @Autowired
    private AopDao aopDao;
    @Override
    public void insert(String name, int age) {
        System.out.println("IocService insert method()");
    }

    @Override
    public void insert(String name) {

    }

    @Override
    public void insert(int age) {

    }

    @Override
    public void delete(String name) {
        aopDao.delete(name);
    }

    @Override
    public void update(String name, int age) {
        aopDao.update(name,age);
    }

    /*public void setIocDao(IocDaoImpl iocDao) {
    }*/
}
