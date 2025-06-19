package com.ijse.gdse.config;

import com.ijse.gdse.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //bean ekak widihata register wenne
@ComponentScan(basePackages = "com.ijse.gdse.bean")
public class AppConfig {
    @Bean
    @Scope("prototype")
    public MyConnection getConnection() {
        return new MyConnection();
    }

}
