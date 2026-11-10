package main;

import dao.ProjectDAO;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Projects {

    public Projects() {

        JFrame frame = new JFrame("YEP - Projects");

        frame.setSize(750, 550);
        frame.setLayout(null);

        frame.getContentPane().setBackground(
                new Color(245, 247, 250));

        // ====================================
        // TITLE
        // ====================================

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT");

        title.setBounds(140, 15, 500, 40);

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 24));

        title.setForeground(
                new Color(30, 58, 138));

        frame.add(title);

        // ====================================
        // SUBTITLE
        // ====================================

        JLabel subtitle =
                new JLabel("Available Projects");

        subtitle.setBounds(280, 55, 200, 25);

        subtitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subtitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subtitle);

        // ====================================
        // SUBMIT PROJECT BUTTON
        // ====================================

        JButton submitProject =
                new JButton("💡 Submit Project");

        submitProject.setBounds(
                180,
                100,
                180,
                35);

        submitProject.setBackground(
                new Color(22, 163, 74));

        submitProject.setForeground(
                Color.WHITE);

        submitProject.setFont(
                new Font("Segoe UI", Font.BOLD, 13));

        submitProject.setFocusPainted(false);

        submitProject.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        submitProject.addActionListener(e -> {
            new SubmitProject();
        });

        frame.add(submitProject);

        // ====================================
        // BACK BUTTON
        // ====================================

        JButton backButton =
                new JButton("⬅ Back");

        backButton.setBounds(
                390,
                100,
                180,
                35);

        backButton.setBackground(
                new Color(37, 99, 235));

        backButton.setForeground(
                Color.WHITE);

        backButton.setFont(
                new Font("Segoe UI", Font.BOLD, 13));

        backButton.setFocusPainted(false);

        backButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        backButton.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(backButton);

        // ====================================
        // PROJECT CARDS
        // ====================================

        try {

            ProjectDAO dao =
                    new ProjectDAO();

            ResultSet rs =
                    dao.getProjects();

            int y = 170;

            while (rs.next()) {

                JPanel card = new JPanel();

                card.setLayout(null);

                card.setBounds(
                        60,
                        y,
                        600,
                        55);

                card.setBackground(
                        Color.WHITE);

                card.setBorder(
                        BorderFactory.createLineBorder(
                                new Color(
                                        220,
                                        220,
                                        220
                                )
                        )
                );

                JLabel project =
                        new JLabel(
                                "💡 "
                                + rs.getString("title")
                                + "   |   Status: "
                                + rs.getString("status")
                        );

                project.setBounds(
                        15,
                        10,
                        550,
                        30);

                project.setFont(
                        new Font(
                                "Segoe UI",
                                Font.BOLD,
                                14
                        )
                );

                card.add(project);

                frame.add(card);

                y += 70;
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        // ====================================
        // FOOTER
        // ====================================

        JLabel footer =
                new JLabel(
                        "Empowering Youth Through Learning & Innovation"
                );

        footer.setBounds(
                180,
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

        // ====================================

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}