package com.hillel.java.introduction.lesson13;

public enum DayOfWeekEnum {

    MONDAY(8), TUESDAY(8), WEDNESDAY(8), SATURDAY(0), SUNDAY(0);

    private int workingHours;

    DayOfWeekEnum(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
