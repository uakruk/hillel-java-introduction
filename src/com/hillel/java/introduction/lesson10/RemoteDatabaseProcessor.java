package com.hillel.java.introduction.lesson10;

public abstract class RemoteDatabaseProcessor extends DatabaseProcessor {

    public abstract void remoteConnect();

    @Override
    public void runQuery(String query) {
        System.out.println("Running query... " + query);
    }
}
