package com.ijse.gdse.config;

import com.ijse.gdse.bean.B;
import com.ijse.gdse.bean.C;
import com.ijse.gdse.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ijse.gdse")
public class AppConfig2 {

    @Bean
    public C c() {
        return new C();
    }

    @Bean
    public D d() {
        return new D();
    }
}
