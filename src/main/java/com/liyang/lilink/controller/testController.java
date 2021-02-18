package com.liyang.lilink.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello, springBoot! My name is: "+name;
    }
}
