package com.ijse.gdse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("char")
public class CharacterMappingController {

    //char/item/Iabc - worked
    //char/item/I123 - worked
    //char/item/I@@@ - worked
    //char/item/I@@@@ - Not worked

    @GetMapping("item/I???")
    public String sayHello() {
        return "sayHello";
    }



    @GetMapping("????/search")
    public String hello() {
        return "hello";
    }
}
