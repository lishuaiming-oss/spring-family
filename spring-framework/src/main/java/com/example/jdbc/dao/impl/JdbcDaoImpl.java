package com.example.jdbc.dao.impl;

import com.example.jdbc.dao.JdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/20-11:23
 */
@Repository
public class JdbcDaoImpl implements JdbcDao {

    @Autowired
    private JdbcOperations jdbcOperations;
    @Override
    public void insert(String name, int age) {
          jdbcOperations.update("insert into spring_jdbc(name,age) values(?,?)",new Object[]{name,age});
    }

    @Override
    public List<Map<String, Object>> query() {
      //  return   jdbcOperations.query("select name,age from spring_jdbc");
     return jdbcOperations.queryForList("select id, name,age from spring_jdbc")  ;
    }
}
