package com.hillel.java.introduction.lastlesson;

public class ChildClass extends ParentClass {

    private int childNumber;

    private String childString;

    public String childOpenField;

    public ChildClass(int childNumber, String childString) {
        this.childNumber = childNumber;
        this.childString = childString;
    }

    @Override
    public Number getObjectNumber() {
     //   Number objectNumber = super.getObjectNumber();

//        if (objectNumber != null) {
//            return objectNumber;
//        }
        return 10d;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public String getChildString() {
        return childString;
    }

    private void privateMethod() {
        System.out.println("I'm private");
    }

}
