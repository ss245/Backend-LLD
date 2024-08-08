package com.ecommerce.Singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db1);
        System.out.println(db2);
    }
}
