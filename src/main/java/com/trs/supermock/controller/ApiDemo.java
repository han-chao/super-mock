package com.trs.supermock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ApiDemo {

    @GetMapping("/say")
    public String say(){
        return "Hi !";
    }
}
