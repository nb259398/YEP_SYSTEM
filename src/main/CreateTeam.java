package main;

import dao.TeamDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreateTeam {

    public CreateTeam() {

        JFrame frame = new JFrame("YEP - Create Team");

        frame.setSize(600, 400);
        frame.setLayout(null);

        frame.getContentPane().setBackground(
                new Color(245, 247, 250));

        // ====================================
        // TITLE
        // ====================================

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT");

        title.setBounds(90, 20, 450, 35);

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 24));

        title.setForeground(
                new Color(30, 58, 138));

        frame.add(title);

        // ====================================
        // SUBTITLE
        // ====================================

        JLabel subtitle =
                new JLabel("Create a New Team");

        subtitle.setBounds(220, 60, 180, 25);

        subtitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subtitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subtitle);

        // ====================================
        // TEAM NAME LABEL
        // ====================================

        JLabel lblName =
                new JLabel("Team Name");

        lblName.setBounds(120, 130, 120, 30);

        lblName.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        frame.add(lblName);

        // ====================================
        // TEXT FIELD
        // ====================================

        JTextField txtName =
                new JTextField();

        txtName.setBounds(250, 130, 200, 35);

        txtName.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(txtName);

        // ====================================
        // CREATE BUTTON
        // ====================================

        JButton btnCreate =
                new JButton("👥 Create Team");

        btnCreate.setBounds(
                180,
                210,
                220,
                40);

        btnCreate.setBackground(
                new Color(22, 163, 74));

        btnCreate.setForeground(
                Color.WHITE);

        btnCreate.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        btnCreate.setFocusPainted(false);

        btnCreate.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        btnCreate.addActionListener(e -> {

            String teamName =
                    txtName.getText().trim();

            if(teamName.isEmpty()){

                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a team name."
                );

                return;
            }

            TeamDAO dao =
                    new TeamDAO();

            boolean success =
                    dao.createTeam(teamName);

            if(success){

                JOptionPane.showMessageDialog(
                        null,
                        "Team Created Successfully!"
                );

                txtName.setText("");

            }else{

                JOptionPane.showMessageDialog(
                        null,
                        "Failed to Create Team!"
                );
            }
        });

        frame.add(btnCreate);

        // ====================================
        // BACK BUTTON
        // ====================================

        JButton btnBack =
                new JButton("⬅ Back");

        btnBack.setBounds(
                180,
                270,
                220,
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

        btnBack.addActionListener(
                e -> frame.dispose()
        );

        frame.add(btnBack);

        // ====================================
        // FOOTER
        // ====================================

        JLabel footer =
                new JLabel(
                        "Empowering Youth Through Learning & Innovation"
                );

        footer.setBounds(
                120,
                330,
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