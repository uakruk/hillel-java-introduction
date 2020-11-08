package com.hillel.java.introduction.katerynadanko.lesson9.lection.oop;

public class JeckRassel extends Dog{
    int size;
    int age;
    String name;

    public JeckRassel() {
        System.out.println("JeckRassel without parameters");
    }

    public JeckRassel(int size, int age, String name) {
        this.size = size;
        this.age = age;
        this.name = name;
        System.out.println("JeckRassel with parameters");
    }

    @Override
    public String toString() {
        return "JeckRassel{" +
                "size=" + size +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void eatShoes() {
        System.out.println("I`m JeckRassel and I don`t like eat shoes");
    }
}
