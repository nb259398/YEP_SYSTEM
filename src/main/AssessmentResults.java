package main;

import dao.AssessmentResultDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AssessmentResults {

    public AssessmentResults() {

        JFrame frame = new JFrame("YEP - Assessment Results");

        frame.setSize(700, 520);
        frame.setLayout(null);

        frame.getContentPane().setBackground(
                new Color(245, 247, 250));

        // ====================================
        // TITLE
        // ====================================

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT");

        title.setBounds(120, 20, 500, 35);

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 24));

        title.setForeground(
                new Color(30, 58, 138));

        frame.add(title);

        // ====================================
        // SUBTITLE
        // ====================================

        JLabel subtitle =
                new JLabel("Assessment Results Management");

        subtitle.setBounds(220, 60, 250, 25);

        subtitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subtitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subtitle);

        // ====================================
        // USER ID
        // ====================================

        JLabel lblUser =
                new JLabel("User ID");

        lblUser.setBounds(120, 120, 120, 30);

        lblUser.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        JTextField txtUser =
                new JTextField();

        txtUser.setBounds(280, 120, 220, 35);

        txtUser.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(lblUser);
        frame.add(txtUser);

        // ====================================
        // ASSESSMENT TITLE
        // ====================================

        JLabel lblTitle =
                new JLabel("Assessment Title");

        lblTitle.setBounds(120, 170, 140, 30);

        lblTitle.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        JTextField txtTitle =
                new JTextField();

        txtTitle.setBounds(280, 170, 220, 35);

        txtTitle.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(lblTitle);
        frame.add(txtTitle);

        // ====================================
        // SCORE
        // ====================================

        JLabel lblScore =
                new JLabel("Score");

        lblScore.setBounds(120, 220, 120, 30);

        lblScore.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        JTextField txtScore =
                new JTextField();

        txtScore.setBounds(280, 220, 220, 35);

        txtScore.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(lblScore);
        frame.add(txtScore);

        // ====================================
        // FEEDBACK
        // ====================================

        JLabel lblFeedback =
                new JLabel("Feedback");

        lblFeedback.setBounds(120, 270, 120, 30);

        lblFeedback.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        JTextField txtFeedback =
                new JTextField();

        txtFeedback.setBounds(280, 270, 220, 35);

        txtFeedback.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(lblFeedback);
        frame.add(txtFeedback);

        // ====================================
        // SAVE BUTTON
        // ====================================

        JButton btnSave =
                new JButton("📝 Save Result");

        btnSave.setBounds(
                190,
                340,
                250,
                40);

        btnSave.setBackground(
                new Color(22, 163, 74));

        btnSave.setForeground(
                Color.WHITE);

        btnSave.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        btnSave.setFocusPainted(false);

        btnSave.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        btnSave.addActionListener(e -> {

            try {

                int user_Id =
                        Integer.parseInt(
                                txtUser.getText().trim()
                        );

                int score =
                        Integer.parseInt(
                                txtScore.getText().trim()
                        );

                String assessmentTitle =
                        txtTitle.getText().trim();

                String feedback =
                        txtFeedback.getText().trim();

                if (assessmentTitle.isEmpty()
                        || feedback.isEmpty()) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Please complete all fields."
                    );

                    return;
                }

                AssessmentResultDAO dao =
                        new AssessmentResultDAO();

                boolean success =
                        dao.saveResult(
                                user_Id,
                                assessmentTitle,
                                score,
                                feedback
                        );

                if (success) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Assessment Saved Successfully!"
                    );

                    txtUser.setText("");
                    txtTitle.setText("");
                    txtScore.setText("");
                    txtFeedback.setText("");

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Save Failed!"
                    );
                }

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "User ID and Score must be numbers."
                );
            }
        });

        frame.add(btnSave);

        // ====================================
        // BACK BUTTON
        // ====================================

        JButton btnBack =
                new JButton("⬅ Back");

        btnBack.setBounds(
                190,
                390,
                250,
                40);

        btnBack.setBackground(
                new Color(37, 99, 235));

        btnBack.setForeground(
                Color.WHITE);

        btnBack.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        btnBack.setFocusPainted(false);

        btnBack.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        btnBack.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(btnBack);

        // ====================================
        // FOOTER
        // ====================================

        JLabel footer =
                new JLabel(
                        "Empowering Youth Through Learning & Innovation"
                );

        footer.setBounds(
                170,
                450,
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