package com.example.mvc.user.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @programe: spring-family
 * @Description: 测试一次请求访问到结束时间
 * @Author: li shuai ming
 * @Create: 2021/5/8-11:13
 */
public class TimeInterceptor implements HandlerInterceptor {

    long start=0;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        start=System.currentTimeMillis();
        return true;
    }



    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        long end=System.currentTimeMillis();
        System.out.println(end-start+".ms");
    }
}
