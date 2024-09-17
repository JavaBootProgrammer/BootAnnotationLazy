package com.google;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Date;

@Configuration
@Component("PersonSettingsPage")
public class PersonSettingsPage {
    private String firstName="ram";
    private String lastName="ra";
    private String email="an";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Bean("date")
    public Date getDate(){
        return new Date();
    }


    public PersonSettingsPage(String firstName, String lastName, String email) {
        System.out.println("param constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
//    @Autowired
    public PersonSettingsPage(){
        System.out.println("default constructor");
    }





}
