package main;

import dao.CertificateDAO;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Certificates {

    public Certificates() {

        JFrame frame = new JFrame("YEP - Certificates");

        frame.setSize(750, 550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(
                new Color(245, 247, 250));

        // ==================================================
        // TITLE
        // ==================================================

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(50,15,650,40);
        

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 24));

        title.setForeground(
                new Color(30, 58, 138));

        frame.add(title);

        // ==================================================
        // SUBTITLE
        // ==================================================

        JLabel subTitle =
                new JLabel("Available Certificates");

        subTitle.setBounds(280, 55, 250, 25);

        subTitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subTitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subTitle);

        // ==================================================
        // AWARD BUTTON
        // ==================================================

        JButton awardButton =
                new JButton("🏆 Award Certificate");

        awardButton.setBounds(270, 95, 180, 35);

        awardButton.setBackground(
                new Color(22, 163, 74));

        awardButton.setForeground(Color.WHITE);

        awardButton.setFont(
                new Font("Segoe UI", Font.BOLD, 13));

        awardButton.setFocusPainted(false);

        awardButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        awardButton.addActionListener(e -> {
            new AwardCertificate();
        });

        frame.add(awardButton);

        // ==================================================
        // BACK BUTTON
        // ==================================================

        JButton backButton =
                new JButton("⬅ Back");

        backButton.setBounds(270, 140, 180, 35);

        backButton.setBackground(
                new Color(37, 99, 235));

        backButton.setForeground(Color.WHITE);

        backButton.setFont(
                new Font("Segoe UI", Font.BOLD, 13));

        backButton.setFocusPainted(false);

        backButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        backButton.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(backButton);

        // ==================================================
        // CERTIFICATES
        // ==================================================

        try {

            CertificateDAO dao =
                    new CertificateDAO();

            ResultSet rs =
                    dao.getCertificates();

           int y = 200;

            while (rs.next()) {

                JLabel cert =
                        new JLabel(
                                "🏆  "
                                + rs.getString("certificate_name")
                        );

                cert.setBounds(
                        80,
                        y,
                        550,
                        45);

                cert.setFont(
                        new Font(
                                "Segoe UI",
                                Font.BOLD,
                                15));

                cert.setOpaque(true);

                cert.setBackground(
                        new Color(252,252,252));

                cert.setBorder(
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createLineBorder(
                                        new Color(
                                                220,
                                                220,
                                                220)),
                                BorderFactory.createEmptyBorder(
                                        5,
                                        15,
                                        5,
                                        15)));

                frame.add(cert);

                y += 60;
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        // ==================================================
        // FOOTER
        // ==================================================

        JLabel footer =
                new JLabel(
                        "Youth Empowerment Project Management System");

        footer.setBounds(
                210,
                470,
                350,
                25);

        footer.setForeground(
                Color.GRAY);

        footer.setFont(
                new Font(
                        "Segoe UI",
                        Font.ITALIC,
                        12));

        frame.add(footer);

        // ==================================================

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}