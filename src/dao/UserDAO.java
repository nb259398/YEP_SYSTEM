package dao;

import database.DBConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    public boolean registerUser(User user) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
            "INSERT INTO users(fullName,email,password,role) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, user.fullName);
            ps.setString(2, user.email);
            ps.setString(3, user.password);
            ps.setString(4, user.role);

            int rows =
                    ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;
    }
    public boolean login(String email, String password) {

    try {

        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM users WHERE email=? AND password=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, email);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        return rs.next();

    } catch (Exception e) {

        e.printStackTrace();
    }

    return false;
}
    
}