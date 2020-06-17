package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 整合Filter方式第一
 */
//@WebFilter(filterName = "testFilter",urlPatterns = {"*.do","*.jsp","/test","/test2"})
public class TestFilter01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Filter。。。");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开filter。。。");
    }

    @Override
    public void destroy() {

    }
}
