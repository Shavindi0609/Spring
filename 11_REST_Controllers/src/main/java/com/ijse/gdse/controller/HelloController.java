package com.ijse.gdse.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping
    public String getMapping() {
        return "GET";
    }
//
//    @GetMapping("get2")
//    public String getMapping2() {
//        return "GET2";
//    }

    @PostMapping
    public String postMapping() {
        return "POST";
    }

    @PutMapping
    public String putMapping() {
        return "PUT";
    }
}
