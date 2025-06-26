package com.ijse.gdse;

import com.ijse.gdse.bean.*;
import com.ijse.gdse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);

        context.refresh();


            A a1 =context.getBean(A.class);
            A a2 = context.getBean(A.class);
            System.out.println(A.class);

            B b1 = context.getBean(B.class);
            B b2 = context.getBean(B.class);
            System.out.println(B.class);

            C c1 = context.getBean(C.class);
            C c2 = context.getBean(C.class);
            System.out.println(C.class);

            D d1 = context.getBean(D.class);
            D d2 = context.getBean(D.class);
            System.out.println(D.class);

            E e1 = context.getBean(E.class);
            E e2 = context.getBean(E.class);
            System.out.println(E.class);

        context.registerShutdownHook();
    }
}
