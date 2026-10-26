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
}