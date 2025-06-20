package com.ijse.gdse;

import com.ijse.gdse.bean.MyConnection;
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
//        SpringBean springBean =  context.getBean(SpringBean.class);
//        System.out.println(springBean);

        //Bean Id
//        SpringBean springBean1 = (SpringBean) context.getBean("springBean");
//        System.out.println(springBean1);
//        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
//        System.out.println(testBean1);

        //bean ID and class name
//        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2", TestBean2.class);
//        System.out.println(testBean2);

//        Runtime.getRuntime().addShutdownHook(new Thread() { //register shutdown Hook
//            @Override
//            public void run() {
//                context.close();
//            }
//        });

//        MyConnection myConnection = context.getBean(MyConnection.class);
//        System.out.println(myConnection);
//
//        MyConnection myConnection2 = context.getBean(MyConnection.class);
//        System.out.println(myConnection2);
//
//        MyConnection myConnection3 = (MyConnection) context.getBean("sa", MyConnection.class);
//        System.out.println(myConnection3);
//
//        context.registerShutdownHook();

        TestBean1 bean1 = context.getBean(TestBean1.class);
        TestBean1 bean2 = context.getBean(TestBean1.class);
        System.out.println(bean1);
        System.out.println(bean2);

        MyConnection myConnection1 = (MyConnection) context.getBean("sa");
        MyConnection myConnection2 = (MyConnection) context.getBean("sa");
        System.out.println(myConnection1);
        System.out.println(myConnection2);

        context.registerShutdownHook();

    }
}