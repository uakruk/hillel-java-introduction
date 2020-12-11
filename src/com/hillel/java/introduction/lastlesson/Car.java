package com.hillel.java.introduction.lastlesson;

@Component
public class Car {

    @Autowired
    private Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
