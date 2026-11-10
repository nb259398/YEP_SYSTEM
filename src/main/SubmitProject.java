package main;

import dao.ProjectDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SubmitProject {

    public SubmitProject() {

        JFrame frame = new JFrame("YEP - Submit Project");

        frame.setSize(650, 450);
        frame.setLayout(null);

        frame.getContentPane().setBackground(
                new Color(245, 247, 250));

        // ====================================
        // TITLE
        // ====================================

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT");

        title.setBounds(110, 20, 500, 35);

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 24));

        title.setForeground(
                new Color(30, 58, 138));

        frame.add(title);

        // ====================================
        // SUBTITLE
        // ====================================

        JLabel subtitle =
                new JLabel("Submit a Project");

        subtitle.setBounds(250, 60, 180, 25);

        subtitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subtitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subtitle);

        // ====================================
        // PROJECT TITLE
        // ====================================

        JLabel lblTitle =
                new JLabel("Project Title");

        lblTitle.setBounds(100, 120, 120, 30);

        lblTitle.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        JTextField txtTitle =
                new JTextField();

        txtTitle.setBounds(240, 120, 250, 35);

        txtTitle.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(lblTitle);
        frame.add(txtTitle);

        // ====================================
        // DESCRIPTION
        // ====================================

        JLabel lblDesc =
                new JLabel("Description");

        lblDesc.setBounds(100, 180, 120, 30);

        lblDesc.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        JTextField txtDesc =
                new JTextField();

        txtDesc.setBounds(240, 180, 250, 35);

        txtDesc.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(lblDesc);
        frame.add(txtDesc);

        // ====================================
        // SUBMIT BUTTON
        // ====================================

        JButton submit =
                new JButton("💡 Submit Project");

        submit.setBounds(
                190,
                260,
                240,
                40);

        submit.setBackground(
                new Color(22, 163, 74));

        submit.setForeground(
                Color.WHITE);

        submit.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        submit.setFocusPainted(false);

        submit.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        submit.addActionListener(e -> {

            String projectTitle =
                    txtTitle.getText().trim();

            String description =
                    txtDesc.getText().trim();

            if(projectTitle.isEmpty()
                    || description.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Please fill in all fields."
                );

                return;
            }

            ProjectDAO dao =
                    new ProjectDAO();

            boolean success =
                    dao.submitProject(
                            projectTitle,
                            description,
                            "Pending"
                    );

            if(success){

                JOptionPane.showMessageDialog(
                        null,
                        "Project Submitted Successfully!"
                );

                txtTitle.setText("");
                txtDesc.setText("");

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Submission Failed!"
                );
            }

        });

        frame.add(submit);

        // ====================================
        // BACK BUTTON
        // ====================================

        JButton backButton =
                new JButton("⬅ Back");

        backButton.setBounds(
                190,
                315,
                240,
                40);

        backButton.setBackground(
                new Color(37, 99, 235));

        backButton.setForeground(
                Color.WHITE);

        backButton.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        backButton.setFocusPainted(false);

        backButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        backButton.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(backButton);

        // ====================================
        // FOOTER
        // ====================================

        JLabel footer =
                new JLabel(
                        "Empowering Youth Through Learning & Innovation"
                );

        footer.setBounds(
                150,
                380,
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