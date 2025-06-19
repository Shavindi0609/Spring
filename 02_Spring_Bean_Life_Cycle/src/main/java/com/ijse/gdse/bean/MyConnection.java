package com.ijse.gdse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

   // 1) The state of Intantitation
    public MyConnection() {
        System.out.println("1.MyConnection Constructor");
    }

    // 2) There is no method to find state of populate properties



    // 3) Bean Name aware -> ID
    @Override
    public void setBeanName(String name) {
        System.out.println("3.SetBeanName is Called");

    }


    // 4) Dependancy Injection Bean ekata Add wenawa
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4.SetBeanFactory id called");
    }


    // 5) AOP & DP
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5.SetApplicationContext id called");
    }

    // 6) Complete Bean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6.AfterPropertiesSet id called");
    }
    // 7) Context Closed & remove all available beans from context
    @Override
    public void destroy() throws Exception {
        System.out.println("7.MyConnection destroy");
    }


}
