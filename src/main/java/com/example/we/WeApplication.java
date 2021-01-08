package com.example.we;

import com.example.we.config.TestConfig;
import com.example.we.service.UserService;
import com.example.we.service.ZooService;
import com.example.we.service.ZooServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class WeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeApplication.class, args);
    }

}
