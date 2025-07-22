package com.ijse.gdse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("path")
public class PathVariableController {

    //path/10
    @GetMapping(path = "{id}")
    public String path(@PathVariable("id") String id) {
        return id;
    }

    @GetMapping("{id}/{name}")
    public String path1(@PathVariable("id") String id, @PathVariable("name") String name) {
        return id + " - " + name;
    }

    //path/customer/I001

    @GetMapping(path = "customer/{id:[I][0-9]{3}}")
    public String path2(@PathVariable("id") String id) {
        return "path2 :" + id;
    }

    @GetMapping(path = "item/{code}/branch/{city}")
    public String path3(@PathVariable("code") int code, @PathVariable("city") String city) {
        return "path3 :" + code + " - " + city;
    }


    @GetMapping(path = "items/{code:[I][0-9]{3}}/branch/{city}")
    public String path4(@PathVariable("code") String code , @PathVariable("city") String city) {
        return "path4 :" + code + " - " + city;
    }

    // type ekata gelapenna data danna naththan bad request - error code 400 enawa

}
