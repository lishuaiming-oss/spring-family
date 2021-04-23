package com.example.aop.poxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/19-11:16
 */
public class AopServiceDelegatePoxy implements InvocationHandler {
    @Override
    /** 动态代理 反射技术
      * @param proxy 委托类
     * @param method  连接点
     * @param args   方法参数
     * @return java.lang.Object
     * @exception
     * @throws
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
