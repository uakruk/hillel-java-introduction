package com.hillel.java.introduction.lesson13;

import com.hillel.java.introduction.lesson9.Animal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Documented
public @interface EmailConstraint {

    String message();
}
