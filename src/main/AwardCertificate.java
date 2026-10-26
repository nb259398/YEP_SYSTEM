package main;

import dao.CertificateAwardDAO;
import javax.swing.*;

public class AwardCertificate {

    public AwardCertificate() {

        JFrame frame =
                new JFrame("Award Certificate");

        JLabel lblCertificate =
                new JLabel("Certificate ID:");

        lblCertificate.setBounds(30,50,100,30);

        JTextField txtCertificate =
                new JTextField();

        txtCertificate.setBounds(140,50,150,30);

        JButton btnAward =
                new JButton("Award");

        btnAward.setBounds(140,100,120,30);

        btnAward.addActionListener(e -> {

            int userId = 1;

            int certificateId =
                    Integer.parseInt(
                            txtCertificate.getText()
                    );

            CertificateAwardDAO dao =
                    new CertificateAwardDAO();

            boolean success =
                    dao.awardCertificate(
                            userId,
                            certificateId
                    );

            if(success){

                JOptionPane.showMessageDialog(
                        null,
                        "Certificate Awarded Successfully"
                );

            }else{

                JOptionPane.showMessageDialog(
                        null,
                        "Award Failed"
                );
            }
        });

        frame.add(lblCertificate);
        frame.add(txtCertificate);
        frame.add(btnAward);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}