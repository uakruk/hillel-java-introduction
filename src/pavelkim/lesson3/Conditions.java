package pavelkim.lesson3;

public class Conditions {
    public static void main(String[] args) {

        if (1 > 12) {
            System.out.println("11111");
        }
        System.out.println("after if");

        /**
         * Ternal
         */
        int teperature;
        int month = 10;
        if(month > 3 && month < 10) {
            teperature = 10;
        } else  {
            teperature = 0;
        }
        teperature = month > 3 && month<10 ? 20 : 0;
//        teperature = (month<3) ?

        /**
         * Switch
         */
        int workingHours;
        int day = 2;
        switch (day) {
            case 1 :
                System.out.println("It's monday");
                workingHours = 10;
                break;
            case 2 :
                workingHours = 12;
                break;
            case 3 :
                workingHours = 13;
            case 4 :
            case 5 :
                System.out.println("It's not monday but working day");
                workingHours=7;
            default:
                System.out.println("weekend");
                workingHours=0;
        }
        System.out.println(workingHours);


    }

}
