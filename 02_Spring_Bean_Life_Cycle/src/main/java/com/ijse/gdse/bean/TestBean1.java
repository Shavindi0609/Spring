package com.ijse.gdse.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //context eke register wenawa bean ekakata
@Scope("prototype")
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1 Constructor");
    }
}
