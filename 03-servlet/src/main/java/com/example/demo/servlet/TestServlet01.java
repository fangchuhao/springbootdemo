package com.example.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 整合Servlet方式一
 */
@WebServlet(name = "TestServlet01",urlPatterns = "/test")
public class TestServlet01 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setCharacterEncoding("utf-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.getWriter().write("写回去");
    }
}
