package com.ijse.gdse.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean1 {
    TestBean1(){
        System.out.println("TestBean1 Constructor");
    }
}
