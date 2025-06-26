package com.ijse.gdse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {


//    @Autowired(required = false)
//    public SpringBean(@Value("shavindi")String name,@Value("2") int number,@Value("true") boolean value) {
//        System.out.println(name);
//        System.out.println(number);
//        System.out.println(value);
//
//    }
//
//
//    @Autowired(required = false)
//    public SpringBean(@Value("shavindi")String name,@Value("2") int number) {
//        System.out.println(name);
//        System.out.println(number);
//
//    }

    @Value("shavindi")
    private String name;

    @Value("aloka")
    private String key;

    public SpringBean() {
        System.out.println(name);//Life cycle ekedi propery walata value assign wenna nam object eka create wela inna oni.(Insansiation).methendi thama object eka create wela iwara na. e hinda value eka assign wenne na null enne
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(key);
        System.out.println(name);
    }
}
