package com.hillel.java.introduction.lastlesson;

import com.hillel.java.introduction.lesson9.Child;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReflectionExample {

    private static void getAllFieldsIncludingParent(List<Field> fields, Class classToCheck) {
        Field[] declaredFields = classToCheck.getDeclaredFields();

        for (Field f : declaredFields) {
            fields.add(f);
        }

        Class superclass = classToCheck.getSuperclass();

        if (superclass != null) {
            getAllFieldsIncludingParent(fields, superclass);
        }
    }

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws Exception {
//        Class<ChildClass> childClassClass = ChildClass.class;
//        Class aClass = ChildClass.class;
//
//        ArrayList<Field> fields = new ArrayList<>();
//
//        getAllFieldsIncludingParent(fields, aClass);
//
//        for (Field f : fields) {
//            System.out.println(f.getName());
//        }
//
//        ChildClass hello = new ChildClass(1, "hello");
//
//        System.out.println(hello.getChildNumber());
//        System.out.println(hello.getChildString());
//
//        Class<? extends ChildClass> childClass = hello.getClass();
//
//        for (Field field : childClass.getDeclaredFields()) {
//            if (field.getName().equals("childNumber")) {
//                field.setAccessible(true);
//                field.set(hello, 2);
//                field.setAccessible(false);
//            }
//        }
//
//        System.out.println(hello.getChildNumber());
//        System.out.println(hello.getChildString());

//        Field[] declaredFields = childClass.getDeclaredFields();
//
//        Field[] openFields = childClass.getFields();
//
//        Method[] methods = childClass.getMethods();
//
//        Method[] declaredMethods = childClass.getDeclaredMethods();
//
//        Constructor<?>[] constructors = childClass.getConstructors();
//
//        Constructor<?>[] declaredConstructors = childClass.getDeclaredConstructors();



//        Annotation[] classAnnotations = childClass.getAnnotations();

        ParentClass parent = new ChildClass(1, "3");

        try {
            Number objectNumber = parent.getObjectNumber();

        } catch (IOException e) {

        }
//
        Class[] classes = PackageScanner.getClasses("com.hillel.java.introduction.lastlesson");

        for (Class aClass : classes) {
            System.out.println("---------------");
            System.out.println(aClass.getName());
            System.out.println(aClass.getCanonicalName());
            System.out.println(aClass.getSimpleName());


            Field[] declaredFields = aClass.getDeclaredFields();
            System.out.println("Declared fields:=====");
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField.getName());
            }
            System.out.println();

            System.out.println("Open fields:======");
            Field[] openFields = aClass.getFields();
            for (Field field : openFields) {
                System.out.println(field.getName());
            }
            System.out.println();

            System.out.println("Open methods:======");
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
            System.out.println();

            System.out.println("Declared methods:=====");
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.out.println(method.getName());
            }
            System.out.println();

            System.out.println("Open constructors:======");
            Constructor<?>[] constructors = aClass.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor.getName());
                System.out.println(Stream.of(constructor.getParameters())
                        .map(parameter -> parameter.getType().getSimpleName() + " : " + parameter.getName())
                        .collect(Collectors.joining(",")));
            }
            System.out.println();

            System.out.println("Declared constructors:=====");
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor constructor : declaredConstructors) {
                System.out.println(constructor.getName());
                System.out.println(Stream.of(constructor.getParameters())
                        .map(parameter -> parameter.getType().getSimpleName() + " : " + parameter.getName())
                        .collect(Collectors.joining(",")));
            }
            System.out.println();

            System.out.println("Annotations available on class:====");
            Annotation[] classAnnotations = aClass.getAnnotations();
            for (Annotation annotation : classAnnotations) {
                System.out.println(annotation.annotationType().getSimpleName());
            }
            System.out.println("----------------");
        }


        Constructor<ChildClass> constructor = ChildClass.class.getConstructor(int.class, String.class);

        ChildClass world = constructor.newInstance(10, "world");

        System.out.println(world.getChildNumber());
        System.out.println(world.getChildString());

    }
}
