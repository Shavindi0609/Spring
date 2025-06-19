package com.ijse.gdse.config;

import com.ijse.gdse.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //bean ekak widihata register wenne
@ComponentScan("com.ijse.gdse.bean")
public class AppConfig {
    @Bean
    public MyConnection getConnection() {
        return new MyConnection();
    }

}
