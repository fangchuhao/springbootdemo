package com.example.demo.config;

import com.example.demo.filter.TestFilter02;
import com.example.demo.listener.TestListener02;
import com.example.demo.servlet.TestServlet02;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Servlet配置类（包括Filter,Listener配置）
 */
@Configuration
public class ServletConfig {
    /**
     * 完成Servlet组件的注册
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean=new ServletRegistrationBean(new TestServlet02());
        bean.addUrlMappings("/test2");
        return bean;
    }
    /**
     * 完成Filter组件的注册
     */
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean bean=new FilterRegistrationBean(new TestFilter02());
        bean.addUrlPatterns(new String[]{"*.do","*.jsp","/test","/test2"});
        return bean;
    }
    /**
     * 完成Listener组件的注册
     */
    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean bean=new ServletListenerRegistrationBean(new TestListener02());
        return bean;
    }
}
