package com.ijse.gdse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController Constructor");
    }

    @GetMapping
    public String hello() {
        return "Hello Test1 Method";
    }

    @GetMapping("one")
    public String test1() {
        return "Hello Spring";
    }

    @GetMapping("two")
    public String test2(){
        return "Hello Test Method";
    }
}
