package com.ijse.gdse.config;

import com.ijse.gdse.bean.SpringBean;
import com.ijse.gdse.controller.HelloController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages ={"com.ijse.gdse.bean"})
@EnableWebMvc
public class WebRootConfig {
}
