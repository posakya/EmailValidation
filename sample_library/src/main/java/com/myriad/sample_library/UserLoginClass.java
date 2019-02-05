package com.myriad.sample_library;

import com.myriad.sample_library.validation.Validation;

public class UserLoginClass {

    private String name;
    private String email;

    public UserLoginClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailValid(){

        if (!email.matches(Validation.emailPattern))
            return false;

        return true;

    }
}
