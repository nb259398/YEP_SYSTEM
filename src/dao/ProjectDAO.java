package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProjectDAO {

    public ResultSet getProjects() {

        try {

            Connection con =
                DBConnection.getConnection();

            String sql =
                "SELECT * FROM projects";

            PreparedStatement ps =
                con.prepareStatement(sql);

            return ps.executeQuery();

        } catch(Exception e) {

            e.printStackTrace();
        }

        return null;
    }
    public boolean submitProject(String title,
                             String description,
                             String status) {

    try {

        Connection con =
                DBConnection.getConnection();

        String sql =
        "INSERT INTO projects(title, description, status)"
        + " VALUES(?,?,?)";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, title);
        ps.setString(2, description);
        ps.setString(3, status);

        int result = ps.executeUpdate();

        return result > 0;

    } catch(Exception e) {

        e.printStackTrace();
    }

    return false;
}
}