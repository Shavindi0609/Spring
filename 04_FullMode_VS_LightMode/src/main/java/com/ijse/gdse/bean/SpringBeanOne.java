package com.ijse.gdse.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class SpringBeanOne implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    public SpringBeanOne() {
        System.out.println("1. SpringBeanOne Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3. SpringBeanOne setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. SpringBeanOne setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5. SpringBeanOne setApplicationContext");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. SpringBeanOne afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("7. SpringBeanOne destroy");
    }

}
