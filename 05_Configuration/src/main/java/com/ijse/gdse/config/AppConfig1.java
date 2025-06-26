package com.ijse.gdse.config;


import com.ijse.gdse.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ijse.gdse.bean")
public class AppConfig1 {
    @Bean
    public SpringBeanOne springBeanOne() {
        return new SpringBeanOne();
    }
}
