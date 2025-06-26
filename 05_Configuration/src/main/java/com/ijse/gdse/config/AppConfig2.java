package com.ijse.gdse.config;

import com.ijse.gdse.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ijse.gdse")
public class AppConfig2 {

    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }
}
