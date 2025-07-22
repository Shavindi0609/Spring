package com.ijse.gdse.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamController {

    @GetMapping(params = {"id"})
    public String hello(@RequestParam("id") String id) {
        return id;
    }

    @GetMapping(params = {"id","name"})
    public String hello1(@RequestParam("id") String id, @RequestParam("name") String name) {
       return "param1" + id + name;
    }
}
