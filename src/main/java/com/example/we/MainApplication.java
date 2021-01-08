package com.example.we;

import com.example.we.config.TestConfig;
import com.example.we.service.UserService;
import com.example.we.service.ZooService;
import com.example.we.service.ZooServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ServiceLoader;

/**
 * @author sunmeixin
 * @description
 * @date 2020-08-29
 */
@ComponentScan("com.example.we.*")
public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainApplication.class);
        context.refresh();

        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println("beanNames: " + beanName);
        }
        context.close();


    }
}
