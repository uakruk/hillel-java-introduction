package com.hillel.java.introduction.game.model;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Team implements Iterable<Unit> {

    protected final TeamSide teamSide;

    protected final String teamName;

    private double moneyAvailable = 10_000;

    protected List<Unit> units;

    public Team(String teamName, TeamSide teamSide) {
        // assign the teamName and the teamSide values
        // initialize the units with a new ArrayList<>();
    }

    public void addUnit(Unit unit) {
        // here the logic where you check for the maximum allowed number of magics, healers, etc and you add them to the unit list.
    }

    public List<Unit> getUnits() {
        return units;
    }

    // here you can skip editing this logic, remember about the foreach-syntax and on which interface it's based on (Iterable)
    @Override
    public Iterator<Unit> iterator() {
        return units.iterator();
    }

    @Override
    public void forEach(Consumer<? super Unit> action) {
        units.forEach(action);
    }

    @Override
    public Spliterator<Unit> spliterator() {
        return units.spliterator();
    }
}
