package com.ijse.gdse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController //me classeka athule @Component class eka thiye
@Controller
@RequestMapping("hello")
public class HelloController {


    @GetMapping
    public String hello() {
        return "index";
    }
//
//    @GetMapping
//    public String hello2() {
//        return "customer";
//    }


//    public HelloController() {
//        System.out.println("HelloController Constructor");
//    }

//    @GetMapping
//    public String hello() {
//        return "Hello Test1 Method";
//    }

//    @GetMapping("one")
//    public String test1() {
//        return "Hello Spring";
//    }
//
//    @GetMapping("two")
//    public String test2(){
//        return "Hello Test Method";
//    }
}

//for performance improvment
//
//web root - business logic
//   web servlet -    request access
//
//        rest - representational state transfer