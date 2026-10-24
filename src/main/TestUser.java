package main;

import model.User;

public class TestUser {

    public static void main(String[] args) {

        User user1 = new User();

        user1.userId = 1;
        user1.fullName = "Nsobya Bosco";
        user1.email = "bosco@yep.com";
        user1.password = "123456";
        user1.role = "Youth";

        System.out.println("ID: " + user1.userId);
        System.out.println("Name: " + user1.fullName);
        System.out.println("Email: " + user1.email);
        System.out.println("Role: " + user1.role);
    }
}