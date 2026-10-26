package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnrollmentDAO {

    public boolean enrollCourse(int userId, int courseId) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "INSERT INTO user_courses(user_id, course_id) VALUES(?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, userId);
            ps.setInt(2, courseId);

            int result = ps.executeUpdate();

            return result > 0;

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}