package com.hillel.java.introduction.lesson13;

public class DayOfWeek {

    private String dayName;

    public DayOfWeek(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public static void main(String[] args) {
        new DayOfWeek("Monday");

        DayOfWeekEnum day = DayOfWeekEnum.MONDAY;
        day.getWorkingHours();

    }
}
