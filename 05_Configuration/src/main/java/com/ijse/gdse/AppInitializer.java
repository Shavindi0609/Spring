package com.ijse.gdse;

import com.ijse.gdse.bean.SpringBeanOne;
import com.ijse.gdse.bean.SpringBeanTwo;
import com.ijse.gdse.config.AppConfig1;
import com.ijse.gdse.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig1.class);
        context.register(AppConfig2.class); // Multiple Configuration Class thiyaganna puluwan

        context.refresh();

        SpringBeanOne springBeanOne1 = context.getBean(SpringBeanOne.class);
        SpringBeanOne springBeanOne2 = context.getBean(SpringBeanOne.class);
        System.out.println(springBeanOne1); // Singleton Behaviou ekak thiyenne(id eka samanai dekema)
        System.out.println(springBeanOne2);

        SpringBeanTwo springBeanTwo1 = context.getBean(SpringBeanTwo.class);
        SpringBeanTwo springBeanTwo2 = context.getBean(SpringBeanTwo.class);
        System.out.println(springBeanTwo1);// Singleton Behaviou ekak thiyenne(id eka samanai dekema)
        System.out.println(springBeanTwo2);

        context.registerShutdownHook();
    }
}