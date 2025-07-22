package com.ijse.gdse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildcard")
public class WildCardMapping {

    //wild/test/abc/hello - worked
    //wild/test/abc123/hello - worked

    //wild/test/hello - not worked
    //wild/test/123/hell - not worked
    //wild/test/abc123/de/hello - not worked

    @GetMapping("test/*/hello")
    public String hello() {
        return "Wild Card";
    }


    //wild/hello/1 - worked
    //wild/hello/1/1 - worked
    //wild/hello/123/123 - worked

    //********** Star mark eka gawata value ekak onimai **************
    @GetMapping("hello/*/*")
    public String hello1() {
        return "Wild Card1";
    }
}
