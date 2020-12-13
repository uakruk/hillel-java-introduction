package com.hillel.java.introduction.lesson13;

import com.hillel.java.introduction.lesson13.utils.Random;

public class UserRegistrationData {

    @EmailConstraint(message = "Wrong email")
    private String email;

    private String password;

    public UserRegistrationData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) throws Exception {
        UserRegistrationData data = new UserRegistrationData("myEmailmail.com", "password");
        "Fully qualified class name".length();

        Random random = new Random();
        random.toString();

        java.util.Random random1 = new java.util.Random();


        new EmailValidator().validate(data);
    }
}
