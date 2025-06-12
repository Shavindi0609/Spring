package com.ijse.gdse;

import com.ijse.gdse.bean.SpringBean;
import com.ijse.gdse.bean.TestBean1;
import com.ijse.gdse.bean.TestBean2;
import com.ijse.gdse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        //class name
        SpringBean springBean =  context.getBean(SpringBean.class);
        System.out.println(springBean);

        //Bean Id
        SpringBean springBean1 = (SpringBean) context.getBean("springBean");
        System.out.println(springBean1);
        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
        System.out.println(testBean1);

        //bean ID and class name
        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2", TestBean2.class);
        System.out.println(testBean2);

//        Runtime.getRuntime().addShutdownHook(new Thread() { //register shutdown Hook
//            @Override
//            public void run() {
//                context.close();
//            }
//        });

        context.registerShutdownHook();


    }
}