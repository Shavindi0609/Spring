package com.ijse.gdse.config;

import com.ijse.gdse.bean.MyConnection;
import com.ijse.gdse.bean.TestBean2;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.ijse.gdse.bean")
public class AppConfig {
   @Bean("sa")
   @Scope("prototype") // bean eka context eka athulata daganne na e nisa bean life cycle eke destroy part eka prototype bean ekakata na
    public MyConnection getConnection() {
        return new MyConnection();
    }
}

