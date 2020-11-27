package com.hillel.java.introduction.lesson10;

public interface RemoteConnectable {

    default void remoteConnect() {
        System.out.println("Connect from interface");
    }
}
