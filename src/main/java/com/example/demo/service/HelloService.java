package com.example.demo.service;

import com.example.demo.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public Greeting createGreeting(String name) {
        return new Greeting("Hello, " + name + "!");
    }
}