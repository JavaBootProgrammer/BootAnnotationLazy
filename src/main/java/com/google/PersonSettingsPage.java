package com.google;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class PersonSettingsPage {
    private String firstName;
    private String lastName;
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
