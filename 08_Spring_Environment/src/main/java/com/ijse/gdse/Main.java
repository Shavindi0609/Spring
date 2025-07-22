package com.ijse.gdse;

import com.ijse.gdse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Map<String,String> env = System.getenv(); // system data (windows,drivers) gena wisthara denawa.
//        for(Map.Entry<String,String> entry : env.entrySet()){
//            System.out.println(entry.getKey()+"="+entry.getValue());
//        }
//
//        System.out.println(env.get("OS"));
//
//
////        ************ Predefined Java Properties *************************
//        System.getProperties().list(System.out);

        context.registerShutdownHook();
    }
}