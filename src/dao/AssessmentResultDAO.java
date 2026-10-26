package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AssessmentResultDAO {

   public boolean saveResult(
        int userId,
        String title,
        int score,
        String feedback) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
       "INSERT INTO assessments(user_id,title,score,feedback)"
+     " VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

           ps.setInt(1, userId);
           ps.setString(2, title);
           ps.setInt(3, score);
           ps.setString(4, feedback);

            int result = ps.executeUpdate();

            return result > 0;

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}