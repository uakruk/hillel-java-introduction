package com.hillel.java.introduction.katerynadanko.architect;

import java.util.ArrayList;
import java.util.List;

public class MakeProject {
    public static void main(String[] args) {
        Project project = new Project("House", 30,500,7);
        System.out.println(project);

        Architect architect = new Architect("Kateryna", 10, 2000);
        System.out.println(architect);
        System.out.println(architect.makeProject(project));

        List<Builder> builders = new ArrayList<>();
        builders.add(new Builder("Vasia", 150));
        builders.add(new Builder("Kolia", 150));
        builders.add(new Builder("Vasia", 150));
        builders.add(new Builder("Tolia", 150));

        System.out.println((new Builder("Vasia", 150)).equals((new Builder("Vasia", 150))));
        System.out.println((new Builder("Kolia", 150)).equals((new Builder("Vasia", 150))));

        System.out.println(builders);

        MainCustomer mainCustomer = new MainCustomer(500,5, "Business centre");
        CustomersChildren customersChildren = new CustomersChildren(20,3,"Make house", 18);
        CustomersWife customersWife = new CustomersWife(100, 25, "I dont know what I want");
        CustomersRelatives customersRelatives = new CustomersRelatives(130, 2, "Make project");


        List <Customer> customers = new ArrayList<>();
        customers.add(mainCustomer);
        customers.add(customersChildren);
        customers.add(customersWife);
        customers.add(customersRelatives);

        System.out.println(customers);

        customersChildren.dontLike();
        customersWife.dontLike();

        Director director = new Director("Volodymyr Petrovych");
        director.setAge(54);
        System.out.println(director.getAge());


        Prorab prorab = new Prorab(4);
        Prorab prorab1 = new Prorab(4);
        System.out.println(prorab.amountOfProject);
        System.out.println(prorab);
        System.out.println(prorab.equals(prorab1));
    }


}
