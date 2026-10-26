package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReportDAO {

    public int getTotalRecords(String tableName) {

        int total = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT COUNT(*) AS total FROM " + tableName;

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                total = rs.getInt("total");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }
}