package com.hillel.java.introduction.katerynadanko.game;

public class GameComponentChecker {
    public  boolean check(Object obj){

    Class [] declaredClasses = obj.getClass().getDeclaredClasses();
    for(Class clazz : declaredClasses){
        GameComponent annotation = (GameComponent) clazz.getAnnotation(GameComponent.class);
        
        if(annotation != null && clazz.isAssignableFrom(String.class)){

            Object object = clazz.getDeclaredClasses();
        }
    }


    return false;
}
}
