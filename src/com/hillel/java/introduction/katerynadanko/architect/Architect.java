package com.hillel.java.introduction.katerynadanko.architect;

import java.util.Objects;

public class Architect {
    private String name;
    private int yearsOfPractice;
    private int salary;

    public Architect(String name, int yearsOfPractice, int salary) {
        this.name = name;
        this.yearsOfPractice = yearsOfPractice;
        this.salary = salary;
    }

    public Project makeProject (Project project) {
        return project;
    }


    @Override
    public String toString() {
        return "Architect{" +
                "name='" + name + '\'' +
                ", yearsOfPractice=" + yearsOfPractice +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Architect architect = (Architect) o;
        return yearsOfPractice == architect.yearsOfPractice &&
                salary == architect.salary &&
                Objects.equals(name, architect.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearsOfPractice, salary);
    }
}
