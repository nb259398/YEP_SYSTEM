package main;

import dao.UserDAO;
import model.User;

public class TestRegistration {

    public static void main(String[] args) {

        User user = new User();

        user.fullName = "Nsobya Bosco";
        user.email = "bosco@gmail.com";
        user.password = "123456";
        user.role = "Youth";

        UserDAO dao = new UserDAO();

        if (dao.registerUser(user)) {

            System.out.println("User Registered Successfully");

        } else {

            System.out.println("Registration Failed");

        }

    }
}