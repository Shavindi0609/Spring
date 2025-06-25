package com.ijse.gdse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterface {

    //************************** property Injection ********************
//    @Autowired
//    DI test1;
//
//    public Test2() {
//        System.out.println("Test2 constructor");
//    }
//    public void calledHelloMethod() {
//        test1.sayHello();
//    }

    //**************** constructor through injection **************** @Autowired annotation eka demmath ekai nathath ekai

//    DI test1;
//
//    @Autowired
//    public Test2(DI test1) {
//        this.test1 = test1;
//    }
//
//    public void calledHelloMethod() {
//        test1.sayHello();
//    }

    //***************** setter method through injection****************

//    DI test1;
//    @Autowired
//    public void setterMethod(DI test1) {
//        this.test1 = test1;
//    }
//
//    public void calledHelloMethod() {
//        test1.sayHello();
//    }
//
//    @Override
//    public void inject(DI di) {
//        this.test1 = test1;
//    }

    //************ Interface through injection ************

    DI test1;

    @Autowired
    @Override
    public void inject(DI test1) {
        this.test1 = test1;
    }

    public void calledHelloMethod() {
        test1.sayHello();
    }

}