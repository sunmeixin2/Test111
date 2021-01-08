package com.example.we.service;

import org.springframework.stereotype.Service;

/**
 * @author sunmeixin
 * @description
 * @date 2020-08-30
 */
@Service
public class ZooServiceImpl implements ZooService {
    @Override
    public void cat() {
        System.out.println("HELLO KITITLY!");
    }
}
