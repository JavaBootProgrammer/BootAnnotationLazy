package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BootAnnotationLazyApplication {



    public static void main(String[] args) {
        SpringApplication.run(BootAnnotationLazyApplication.class, args);

        ApplicationContext context = SpringApplication.run(BootAnnotationLazyApplication.class, args);
        PersonSettingsPage bean= (PersonSettingsPage)context.getBean("date");
        System.out.println(bean.getDate());



    }

}
