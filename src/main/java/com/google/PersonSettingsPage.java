package com.google;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("PersonSettingsPage")
public class PersonSettingsPage {
    private String firstName="ram";
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    private String email;

    public PersonSettingsPage(String firstName, String lastName, String email) {
        System.out.println("param constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public PersonSettingsPage(){
        System.out.println("default constructor");
    }





}
