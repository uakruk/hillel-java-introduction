package com.hillel.java.introduction.lesson10;

public class AbstractExample {

    public static void main(String[] args) {
        DatabaseProcessor databaseProcessor = new MysqlDatabaseProcessor();

        PostgresRemoteDatabaseProcessor postgresRemoteDatabaseProcessor = new PostgresRemoteDatabaseProcessor();
        postgresRemoteDatabaseProcessor.runQuery("SELECT * FROM PROCESSOR;");

        DatabaseProcessor myDatabaseProcessor = new PostgresRemoteDatabaseProcessor();
    }
}
