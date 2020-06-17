package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 整合Listener方式一
 */
//@WebListener
public class TestListener01 implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener...init...");
    }
}
