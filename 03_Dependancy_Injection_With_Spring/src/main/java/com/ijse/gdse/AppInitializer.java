package com.ijse.gdse;

import com.ijse.gdse.bean.Boy;
import com.ijse.gdse.config.AppConfig;
import com.ijse.gdse.di.Test2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//       Boy boy = context.getBean(Boy.class);
//       boy.chatWithGirl();

        Test2 test2 = context.getBean(Test2.class);
        test2.test();

        context.registerShutdownHook();
    }
}