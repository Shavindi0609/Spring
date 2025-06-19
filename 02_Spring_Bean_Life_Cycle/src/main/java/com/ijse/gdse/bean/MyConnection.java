package com.ijse.gdse.bean;

import org.springframework.beans.factory.DisposableBean;

public class MyConnection implements DisposableBean {
    public MyConnection() {
        System.out.println("MyConnection Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection destroy");
    }
}
