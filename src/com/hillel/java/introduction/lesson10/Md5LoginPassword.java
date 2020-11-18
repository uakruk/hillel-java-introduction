package com.hillel.java.introduction.lesson10;

public class Md5LoginPassword extends LoginPasswordObject {

    @Override
    protected String getAlgorithm() {
        return "MD5";
    }
}
