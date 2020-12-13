package com.hillel.java.introduction.lesson13;

import java.lang.reflect.Field;

public class EmailValidator {

    public void validate(Object object) throws Exception {
        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            EmailConstraint annotation = field.getAnnotation(EmailConstraint.class);
            if (annotation != null && field.getType().isAssignableFrom(String.class)) {
                field.setAccessible(true);
                String email = (String) field.get(object);

                if (!email.contains("@")) {
                    throw new RuntimeException(annotation.message());
                }
            }
        }
    }
}
