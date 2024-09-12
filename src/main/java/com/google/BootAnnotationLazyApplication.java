package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootAnnotationLazyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAnnotationLazyApplication.class, args);

        ApplicationContext context = SpringApplication.run(BootAnnotationLazyApplication.class, args);
        PersonSettingsPage bean= (PersonSettingsPage)context.getBean("PersonSettingsPage");
        System.out.println(bean.getFirstName());



    }

}
