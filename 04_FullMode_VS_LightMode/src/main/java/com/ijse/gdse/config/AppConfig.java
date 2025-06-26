package com.ijse.gdse.config;


import com.ijse.gdse.bean.SpringBeanOne;
import com.ijse.gdse.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ijse.gdse.bean")
public class AppConfig {


    //****************** InterBean Dependency Satisfied *********************
//    @Bean
//    public SpringBeanOne springBeanOne() {
//        SpringBeanTwo springBeanTwo1 = springBeanTwo();
//        SpringBeanTwo springBeanTwo2 = springBeanTwo();
//        System.out.println(springBeanTwo1);
//        System.out.println(springBeanTwo2);
//
//        return new SpringBeanOne();
//    }
//
//    @Bean
//    public SpringBeanTwo springBeanTwo() {
//        return new SpringBeanTwo();
//    }
}
