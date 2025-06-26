package com.ijse.gdse.config;

import com.ijse.gdse.bean.E;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.ijse.gdse.bean")
@Import({AppConfig1.class, AppConfig2.class})
public class AppConfig {

}
