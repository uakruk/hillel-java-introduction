package com.hillel.java.introduction.lesson10;

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car(4);
        car.setCarNumber("ABC123");
        car.updateCarNumber("Other car number");

        System.out.println(car);

        String carNumber = car.getCarNumber();
        int numberOfSeats = car.getNumberOfSeats();

        System.out.printf("Car with number'%s' has %d seats\n", carNumber, numberOfSeats);

        // upcast (subclass -> superclass)
        Vehicle vehicle = car;
        String vehicleCarNumber = vehicle.getCarNumber(); // allowed
        vehicle.methodToOverride();
        // vehicle.getNumberOfSeats() // disallowed

        // instanceof check
        if (vehicle instanceof Car) {
            // downcasting (superclass -> subclass)
            Car myCar = (Car) vehicle;
            int myCarNumberOfSeats = myCar.getNumberOfSeats();
            String myCarNumber = myCar.getCarNumber();

            System.out.printf("Car with number'%s' has %d seats\n", myCarNumber, myCarNumberOfSeats);

        }

        Truck truck = new Truck();
        truck.setCarNumber("DEF456");
        truck.setCargoAmount(100);

        // upcast
        Vehicle truckVehicle = truck;
        System.out.println("Calling methodToOverride on truckVehicle:");
        truckVehicle.methodToOverride();

        boolean isTruckCar = truckVehicle instanceof Car;

      //  Car truckCar = (Car) truckVehicle; // classcastexception

        System.out.println("Vehicle yourCar = new Car(4);");
        Vehicle yourCar = new Car(4);
        yourCar.methodToOverride();

        Vehicle.sayHello();
        Car.sayHello();

        Car staticCar = new Car(5);
        Vehicle staticVehicle = new Vehicle();

        staticCar.sayHello();
        staticVehicle.sayHello();

        staticVehicle = new Car(6);
        staticVehicle.sayHello(); // = Vehicle.sayHello();

        staticCar.beebeep();

    }
}
