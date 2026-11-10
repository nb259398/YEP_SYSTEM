package main;

import dao.AssessmentDAO;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Assessments {

    public Assessments() {

        JFrame frame = new JFrame("YEP - Assessments");

        frame.setSize(750, 550);
        frame.setLayout(null);

        frame.getContentPane().setBackground(
                new Color(245, 247, 250));

        // ==========================
        // TITLE
        // ==========================

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT");

        title.setBounds(140, 15, 500, 40);

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 24));

        title.setForeground(
                new Color(30, 58, 138));

        frame.add(title);

        // ==========================
        // SUBTITLE
        // ==========================

        JLabel subtitle =
                new JLabel("Assessment Center");

        subtitle.setBounds(285, 55, 200, 25);

        subtitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subtitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subtitle);

        // ==========================
        // ADD RESULT BUTTON
        // ==========================

        JButton resultsButton =
                new JButton("📝 Add Result");

        resultsButton.setBounds(
                180,
                100,
                180,
                35);

        resultsButton.setBackground(
                new Color(22, 163, 74));

        resultsButton.setForeground(
                Color.WHITE);

        resultsButton.setFont(
                new Font("Segoe UI", Font.BOLD, 13));

        resultsButton.setFocusPainted(false);

        resultsButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        resultsButton.addActionListener(e -> {
            new AssessmentResults();
        });

        frame.add(resultsButton);

        // ==========================
        // BACK BUTTON
        // ==========================

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

        // ==========================
        // ASSESSMENT CARDS
        // ==========================

        try {

            AssessmentDAO dao =
                    new AssessmentDAO();

            ResultSet rs =
                    dao.getAssessments();

            int y = 170;

            boolean hasData = false;

            while (rs.next()) {

                hasData = true;

                JPanel card =
                        new JPanel();

                card.setLayout(null);

                card.setBounds(
                        60,
                        y,
                        550,
                        50);

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

                JLabel assessment =
                        new JLabel(
                                "📝 "
                                + rs.getString("title")
                        );

                assessment.setBounds(
                        15,
                        10,
                        500,
                        30);

                assessment.setFont(
                        new Font(
                                "Segoe UI",
                                Font.BOLD,
                                15
                        )
                );

                card.add(assessment);

                frame.add(card);

                y += 65;
            }

            if (!hasData) {

                JPanel card =
                        new JPanel();

                card.setLayout(null);

                card.setBounds(
                        60,
                        170,
                        550,
                        50);

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

                JLabel empty =
                        new JLabel(
                                "No assessments available yet."
                        );

                empty.setBounds(
                        15,
                        10,
                        300,
                        30);

                empty.setFont(
                        new Font(
                                "Segoe UI",
                                Font.PLAIN,
                                14
                        )
                );

                card.add(empty);

                frame.add(card);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        // ==========================
        // FOOTER
        // ==========================

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

        // ==========================

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}