package com.example.jdbc.service;

import java.util.List;
import java.util.Map;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/20-11:27
 */
public interface JdbcService {
    void insert(String name,int age);
    List<Map<String,Object>> query();
}
