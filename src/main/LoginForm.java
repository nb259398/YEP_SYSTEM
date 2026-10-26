package main;

import dao.UserDAO;
import javax.swing.JOptionPane;

public class LoginForm {

    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog(
                "Enter Email");

        String password = JOptionPane.showInputDialog(
                "Enter Password");

        UserDAO dao = new UserDAO();

        boolean status = dao.login(email, password);

        if (status) {

    JOptionPane.showMessageDialog(
            null,
            "Login Successful");

      new Dashboard();


}

       else {

            JOptionPane.showMessageDialog(
                    null,
                    "Invalid Email or Password");

        }
    }
}