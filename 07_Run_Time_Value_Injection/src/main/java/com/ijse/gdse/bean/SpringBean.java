package com.ijse.gdse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {


    @Autowired(required = false)
    public SpringBean(@Value("shavindi")String name,@Value("2") int number,@Value("true") boolean value) {
        System.out.println(name);
        System.out.println(number);
        System.out.println(value);

    }


    @Autowired(required = false)
    public SpringBean(@Value("shavindi")String name,@Value("2") int number) {
        System.out.println(name);
        System.out.println(number);

    }
}
