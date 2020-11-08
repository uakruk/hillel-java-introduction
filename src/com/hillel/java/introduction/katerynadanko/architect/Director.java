package com.hillel.java.introduction.katerynadanko.architect;

public class Director {
    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Director(String name) {
        this.name = name;
    }
    public static void betterWork(){
        System.out.println("Architect should make project faster and better!");
    }
}
