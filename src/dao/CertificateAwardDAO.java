package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CertificateAwardDAO {

    public boolean awardCertificate(
            int userId,
            int certificateId) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "INSERT INTO user_certificates(user_id, certificate_id) VALUES(?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, userId);
            ps.setInt(2, certificateId);

            int result =
                    ps.executeUpdate();

            return result > 0;

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}