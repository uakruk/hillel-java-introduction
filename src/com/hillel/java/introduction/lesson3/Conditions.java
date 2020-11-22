//package com.hillel.java.introduction.lesson3;
//
//public class Conditions {
//
//    public static void main(String[] args) {
//
//        int temperature;
//
//        int month = 10;
//
//        int workingHours;
//        int day = 1;
//
//        if (day == 1) {
//            workingHours = 10;
//        } else if (day == 2) {
//            workingHours = 12;
//            System.out.println("Nadia is busy today");
//        } else if (day == 3) {
//            workingHours = 13;
//            System.out.println("Oleg is busy today");
//        } else if (day == 4) {
//            workingHours = 4;
//        } else {
//            workingHours = 8;
//        }
//
//        switch (day) {
//            case 1:
//                workingHours = 10;
//                break;
//            case 2:
//                workingHours = 12;
//                System.out.println("Nadia is busy today");
//                break;
//            case 3:
//                workingHours = 13;
//                System.out.println("Oleg is busy today");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                workingHours = 4;
//                break;
//            default:
//                workingHours = 8;
//        }
//
//
//        System.out.println(temperature);
//
//        temperature = month > 3 && month < 10 ? 20 : 0;
//
//        temperature = (month > 3) ? (20) : ( (month > 10) ? 0 : 15);
//
//        System.out.println(temperature);
//    }
//}
