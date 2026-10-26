package main;

import dao.CertificateDAO;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Certificates {

    public Certificates() {

        JFrame frame =
                new JFrame("Certificates");

        JLabel title =
                new JLabel("Available Certificates");

        title.setBounds(120,20,250,30);

        frame.add(title);

        try {

            CertificateDAO dao =
                    new CertificateDAO();

            ResultSet rs =
                    dao.getCertificates();

            int y = 80;

            while(rs.next()) {

                JLabel cert =
                        new JLabel(
                                rs.getString("certificate_name")
                        );

                cert.setBounds(50,y,300,30);

                frame.add(cert);

                y += 40;
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}