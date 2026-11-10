package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Dashboard {

    public Dashboard() {

        JFrame frame = new JFrame("Youth Empowerment Project Dashboard");

        // Window settings
        frame.setSize(650, 650);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(245, 247, 250));
        frame.setLocationRelativeTo(null);

        // =========================
        // HEADER
        // =========================

        JLabel title = new JLabel("YOUTH EMPOWERMENT PROJECT");
        title.setBounds(100, 20, 500, 40);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setForeground(new Color(30, 58, 138));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel subtitle = new JLabel("Empowering Youth Through Learning and Innovation");
        subtitle.setBounds(80, 55, 500, 25);
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitle.setForeground(Color.GRAY);
        subtitle.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel welcome = new JLabel("Welcome to Your Dashboard");
        welcome.setBounds(180, 90, 300, 30);
        welcome.setFont(new Font("Segoe UI", Font.BOLD, 18));
        welcome.setForeground(new Color(44, 62, 80));
        welcome.setHorizontalAlignment(SwingConstants.CENTER);

        // =========================
        // BUTTONS
        // =========================

        JButton courses = new JButton("📚 Learning Modules");
        courses.setBounds(80, 150, 220, 50);
        courses.setBackground(new Color(52, 152, 219));
        courses.setForeground(Color.WHITE);
        courses.setFont(new Font("Segoe UI", Font.BOLD, 14));
        courses.setFocusPainted(false);
        courses.setBorder(BorderFactory.createEmptyBorder());

        courses.addActionListener(e -> {
            new LearningModules();
        });

        JButton teams = new JButton("👥 Teams");
        teams.setBounds(340, 150, 220, 50);
        teams.setBackground(new Color(39, 174, 96));
        teams.setForeground(Color.WHITE);
        teams.setFont(new Font("Segoe UI", Font.BOLD, 14));
        teams.setFocusPainted(false);
        teams.setBorder(BorderFactory.createEmptyBorder());

        teams.addActionListener(e -> {
            new Teams();
        });

        JButton projects = new JButton("💡 Projects");
        projects.setBounds(80, 230, 220, 50);
        projects.setBackground(new Color(243, 156, 18));
        projects.setForeground(Color.WHITE);
        projects.setFont(new Font("Segoe UI", Font.BOLD, 14));
        projects.setFocusPainted(false);
        projects.setBorder(BorderFactory.createEmptyBorder());

        projects.addActionListener(e -> {
            new Projects();
        });

        JButton assessments = new JButton("📝 Assessments");
        assessments.setBounds(340, 230, 220, 50);
        assessments.setBackground(new Color(142, 68, 173));
        assessments.setForeground(Color.WHITE);
        assessments.setFont(new Font("Segoe UI", Font.BOLD, 14));
        assessments.setFocusPainted(false);
        assessments.setBorder(BorderFactory.createEmptyBorder());

        assessments.addActionListener(e -> {
            new Assessments();
        });

        JButton certificates = new JButton("🏆 Certificates");
        certificates.setBounds(80, 310, 220, 50);
        certificates.setBackground(new Color(22, 160, 133));
        certificates.setForeground(Color.WHITE);
        certificates.setFont(new Font("Segoe UI", Font.BOLD, 14));
        certificates.setFocusPainted(false);
        certificates.setBorder(BorderFactory.createEmptyBorder());

        certificates.addActionListener(e -> {
            new Certificates();
        });

        JButton reports = new JButton("📊 Reports");
        reports.setBounds(340, 310, 220, 50);
        reports.setBackground(new Color(231, 76, 60));
        reports.setForeground(Color.WHITE);
        reports.setFont(new Font("Segoe UI", Font.BOLD, 14));
        reports.setFocusPainted(false);
        reports.setBorder(BorderFactory.createEmptyBorder());

        reports.addActionListener(e -> {
            new Reports();
        });

        // =========================
        // FOOTER
        // =========================

        JLabel footer = new JLabel("Youth Empowerment Project Management System");
        footer.setBounds(130, 520, 400, 25);
        footer.setHorizontalAlignment(SwingConstants.CENTER);
        footer.setForeground(Color.GRAY);
        footer.setFont(new Font("Segoe UI", Font.ITALIC, 12));

        // =========================
        // ADD COMPONENTS
        // =========================

        frame.add(title);
        frame.add(subtitle);
        frame.add(welcome);

        frame.add(courses);
        frame.add(teams);
        frame.add(projects);
        frame.add(assessments);
        frame.add(certificates);
        frame.add(reports);

        frame.add(footer);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}