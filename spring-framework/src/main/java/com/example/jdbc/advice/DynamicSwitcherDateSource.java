package com.example.jdbc.advice;

import com.example.jdbc.switcher.DataSourceSwitcher;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *  注解动态切换数据源
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/21-14:00
 */
@Aspect
@Order(2)
@Component
public class DynamicSwitcherDateSource {

    @Pointcut("execution(* com.example.*.service.impl.*.query(..))")
     public void methodPointCut(){}
    @Before("methodPointCut()")
    public void before(){
        System.out.println("-------before-------------");
        //切换数据源
        DataSourceSwitcher.setDataSourceKey();

    }
    @After("methodPointCut()")
     public void after(){
        //切换为原来数据源
      DataSourceSwitcher.defaultDataSurce();
        System.out.println("---------after---------");
    }

}
