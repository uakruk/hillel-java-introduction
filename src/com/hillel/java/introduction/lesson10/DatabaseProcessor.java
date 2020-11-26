package com.hillel.java.introduction.lesson10;

public abstract class DatabaseProcessor {

    protected String databaseName;

    public void processActions(String query) {
        connectToDatabase();
        runQuery(query);
        closeConnection();
    }

    public void connectToDatabase() {
        System.out.println("Connecting to database....");
    }

    public abstract void runQuery(String query);

    public void closeConnection() {
        System.out.println("Closing the connection");
    }
}
