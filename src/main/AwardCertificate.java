package main;

import dao.CertificateAwardDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AwardCertificate {

    public AwardCertificate() {

        JFrame frame = new JFrame("YEP - Award Certificate");

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.getContentPane().setBackground(
                new Color(245, 247, 250));

        // =====================================
        // TITLE
        // =====================================

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT");

        title.setBounds(90, 20, 450, 35);

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 24));

        title.setForeground(
                new Color(30, 58, 138));

        frame.add(title);

        // =====================================
        // SUB TITLE
        // =====================================

        JLabel subtitle =
                new JLabel("Award a Certificate");

        subtitle.setBounds(220, 60, 180, 25);

        subtitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subtitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subtitle);

        // =====================================
        // CERTIFICATE ID LABEL
        // =====================================

        JLabel lblCertificate =
                new JLabel("Certificate ID");

        lblCertificate.setBounds(120, 130, 120, 30);

        lblCertificate.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        frame.add(lblCertificate);

        // =====================================
        // TEXTFIELD
        // =====================================

        JTextField txtCertificate =
                new JTextField();

        txtCertificate.setBounds(250, 130, 180, 35);

        txtCertificate.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(txtCertificate);

        // =====================================
        // AWARD BUTTON
        // =====================================

        JButton btnAward =
                new JButton("🏆 Award Certificate");

        btnAward.setBounds(180, 210, 220, 40);

        btnAward.setBackground(
                new Color(22, 163, 74));

        btnAward.setForeground(Color.WHITE);

        btnAward.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        btnAward.setFocusPainted(false);

        btnAward.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        btnAward.addActionListener(e -> {

            try {

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

                if (success) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Certificate Awarded Successfully!"
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Award Failed!"
                    );
                }

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a valid Certificate ID."
                );
            }
        });

        frame.add(btnAward);

        // =====================================
        // BACK BUTTON
        // =====================================

        JButton btnBack =
                new JButton("⬅ Back");

        btnBack.setBounds(180, 270, 220, 40);

        btnBack.setBackground(
                new Color(37, 99, 235));

        btnBack.setForeground(Color.WHITE);

        btnBack.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        btnBack.setFocusPainted(false);

        btnBack.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        btnBack.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(btnBack);

        // =====================================
        // FOOTER
        // =====================================

        JLabel footer =
                new JLabel(
                        "Empowering Youth Through Learning & Innovation"
                );

        footer.setBounds(
                130,
                330,
                350,
                25);

        footer.setForeground(Color.GRAY);

        footer.setFont(
                new Font("Segoe UI", Font.ITALIC, 12));

        frame.add(footer);

        // =====================================

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}