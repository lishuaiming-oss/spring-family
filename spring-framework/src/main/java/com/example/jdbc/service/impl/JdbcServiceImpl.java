package com.example.jdbc.service.impl;

import com.example.jdbc.dao.JdbcDao;
import com.example.jdbc.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionOperations;

import java.util.List;
import java.util.Map;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/20-11:28
 */
@Service
public class JdbcServiceImpl implements JdbcService {

    @Autowired
    private  JdbcDao jdbcDao;

   /* @Autowired
    private TransactionOperations transactionOperations;*/

    @Override
//  @Transactional

    public void insert(String name, int age) {

        /*
         * 编程型事务通知
        transactionOperations.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                jdbcDao.insert(name,age);
                jdbcDao.insert(name+"124589",25);
                return null;
            }
        });*/

        jdbcDao.insert(name,age);
        jdbcDao.insert(name+"124589",25);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> query() {
       //jdbcDao.insert("11",11);
        return  jdbcDao.query();
    }
}
