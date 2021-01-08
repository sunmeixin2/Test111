package com.example.we.config;

import com.example.we.service.UserService;
import com.example.we.service.ZooService;
import com.example.we.service.ZooServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author sunmeixin
 * @description
 * @date 2020-08-29
 */

@Configuration
@ComponentScan("com.example.we.*")
public class TestConfig {

//    @Bean
//    public UserService userService() {
//        return new UserService();
//    }
////
//    @Bean
//    public ZooServiceImpl zooService(){
//        return new ZooServiceImpl();
//    }

}
