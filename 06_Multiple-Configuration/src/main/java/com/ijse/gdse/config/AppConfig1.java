package com.ijse.gdse.config;


import com.ijse.gdse.bean.A;
import com.ijse.gdse.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ijse.gdse.bean")
public class AppConfig1 {
    @Bean
    public A a() {
        return new A();
    }

    @Bean
    public B b() {
        return new B();
    }


}
