package com.ijse.gdse;

import com.ijse.gdse.bean.MyConnection;
import com.ijse.gdse.bean.TestBean1;
import com.ijse.gdse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        System.out.println(myConnection1);


        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection1);
        System.out.println("================================");
        System.out.println(myConnection2);
        context.registerShutdownHook(); //jvm eka shotdown wena movment eka allata context eka close karanawa

    }
}