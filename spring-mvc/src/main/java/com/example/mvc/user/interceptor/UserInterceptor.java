package com.example.mvc.user.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @programe: spring-family
 * @Description: SpringMvc拦截器
 * @Author: li shuai ming
 * @Create: 2021/5/7-16:53
 */
public class UserInterceptor implements HandlerInterceptor {

    /**
     * 前置拦截(访问controller之前)
     * @param request 请求
     * @param response 响应
     * @param handler 访问的controller
     * @return  true 放行 false 终止请求
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("user intercepter [pre] handler");
        return true;
    }

    /**
     *  后置拦截(访问controller之后)
      * @param null
     * @return
     * @exception
     * @throws
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)  {
        System.out.println("user intercepter [post] handler");

    }

    @Override
    /*
     * @author lishuaiming
     * @description 本次请求即将结束
     * @param request
     * @param response
     * @param handler  控制器
     * @param ex
     * @return void
     * @create 2021/5/8 9:42
     */

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)  {
        System.out.println("user intercepter [after] handler");

    }
}
