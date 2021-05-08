package com.example.mvc.user.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/5/8-15:10
 */
@WebFilter(
         filterName = "UserFilter",
         urlPatterns = "*.do"
           )
public class UserFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("[UserFilter] before");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("[UserFilter] after");
    }
}
