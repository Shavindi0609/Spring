package com.ijse.gdse.config;

import com.ijse.gdse.bean.MyConnection;
import com.ijse.gdse.bean.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = TestBean2.class)
public class AppConfig {
    @Bean
    public MyConnection myConnection() {
        return myConnection();
    }
}

