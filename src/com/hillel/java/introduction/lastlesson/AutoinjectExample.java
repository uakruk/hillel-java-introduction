package com.hillel.java.introduction.lastlesson;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AutoinjectExample {

    private static final Map<Class, Object> context = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Class[] classes = PackageScanner.getClasses("com.hillel.java.introduction.lastlesson");

        for (Class clazz : classes) {
            if (clazz.isAnnotationPresent(Component.class)) {
                context.put(clazz, clazz.newInstance());
            }
        }

        Set<Class> classesAvailable = context.keySet();

        for (Class clazz : classesAvailable) {
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Autowired.class)) {
                    Class fieldType = field.getType();

                    Object engine = context.get(fieldType);

                    Object car = context.get(clazz);

                    field.setAccessible(true);
                    field.set(car, engine);
                }
            }
        }

        Object car = context.get(Car.class);

        System.out.println(car.toString());
    }
}
