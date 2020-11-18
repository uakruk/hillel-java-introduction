package com.hillel.java.introduction.katerynadanko.architect;

import java.util.Objects;

public class Prorab {
    int amountOfProject;

    public Prorab(int amountOfProject) {
        this.amountOfProject = amountOfProject;
    }

    @Override
    public String toString() {
        return "Prorab{" +
                "amountOfProject=" + amountOfProject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prorab prorab = (Prorab) o;
        return amountOfProject == prorab.amountOfProject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfProject);
    }
}
