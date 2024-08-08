package com.ecommerce.Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;
    String url;
    String userName;
    String password;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    private DatabaseConnection(){}

}
