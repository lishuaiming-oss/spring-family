package com.example.ioc2.dao.impl;

import com.example.ioc2.dao.IocDao;
import org.springframework.stereotype.Repository;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:30
 */
@Repository("iocdao")
public class IocDaoImpl implements IocDao {
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
        System.out.println("ioc2DaoImpl method()");
    }

}
