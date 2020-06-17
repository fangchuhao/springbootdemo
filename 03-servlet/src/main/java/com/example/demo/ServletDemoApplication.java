package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan//在springboot启动时，会自动扫描@WebServlet,@WebFilter,@WebListener等注解,并将该类实例化
public class ServletDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletDemoApplication.class, args);
	}

}
