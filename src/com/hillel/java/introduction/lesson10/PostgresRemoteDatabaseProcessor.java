package com.hillel.java.introduction.lesson10;

public class PostgresRemoteDatabaseProcessor extends RemoteDatabaseProcessor {

    @Override
    public void remoteConnect() {
        System.out.println("Void remoteconnected");
    }
}
