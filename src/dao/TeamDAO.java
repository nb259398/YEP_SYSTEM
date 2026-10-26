package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TeamDAO {

    public ResultSet getTeams() {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "SELECT * FROM teams";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            return ps.executeQuery();

        } catch(Exception e) {

            e.printStackTrace();
        }

        return null;
    }
    public boolean createTeam(String teamName) {

    try {

        Connection con =
                DBConnection.getConnection();

        String sql =
                "INSERT INTO teams(team_name) VALUES(?)";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, teamName);

        int result =
                ps.executeUpdate();

        return result > 0;

    } catch(Exception e) {

        e.printStackTrace();
    }

    return false;
}
}