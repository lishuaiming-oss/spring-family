package com.example.jdbc.dao;

import java.util.List;
import java.util.Map;

/**
 * @programe: spring-family
 * @Description: 
 * @Author: li shuai ming
 * @Create:  2021/4/20-11:20
 */
public interface JdbcDao {

    void insert(String name,int age);
    List<Map<String,Object>> query();

}
