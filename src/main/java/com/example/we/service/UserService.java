package com.example.we.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author sunmeixin
 * @description
 * @date 2020-08-29
 */
@Service
public class UserService {
    public String id;

    public String name;

    public void sayHello() {
        System.out.println("hello");
    }

}
