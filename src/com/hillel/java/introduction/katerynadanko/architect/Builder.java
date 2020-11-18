package com.hillel.java.introduction.katerynadanko.architect;

import java.util.Objects;

public class Builder {

    String name;
    int salary;
    public Builder(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void sleep(){
        System.out.println("I`m a worker. I like to sleep at work!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Builder builder = (Builder) o;
        return salary == builder.salary &&
                Objects.equals(name, builder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "I`m a builder " + name +
                " and my salary is " + salary + '\n';
    }
}
