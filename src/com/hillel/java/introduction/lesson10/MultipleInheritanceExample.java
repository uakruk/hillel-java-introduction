package com.hillel.java.introduction.lesson10;

public class MultipleInheritanceExample extends PostgresRemoteDatabaseProcessor implements RemoteConnectable {

    public static void main(String[] args) {
        RemoteConnectable multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.remoteConnect();

    //    RemoteConnectable postgresRemoteConnectable = new PostgresRemoteDatabaseProcessor();
    }
}
