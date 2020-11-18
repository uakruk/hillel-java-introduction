package com.hillel.java.introduction.katerynadanko.architect;

public class Project {
    private String name;
    private int pages;
    private int prise;
    int amountOfBuilders;

    public Project(String name, int pages, int prise, int amountOfBuilders) {
        this.name = name;
        this.pages = pages;
        this.prise = prise;
        this.amountOfBuilders = amountOfBuilders;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", prise=" + prise +
                ", amountOfBuilders=" + amountOfBuilders +
                '}';
    }
}
