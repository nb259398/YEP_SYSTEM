package main;

import dao.ReportDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Reports extends JFrame {

    public Reports() {

        ReportDAO reportDAO = new ReportDAO();

        int totalUsers = reportDAO.getTotalRecords("users");
        int totalCourses = reportDAO.getTotalRecords("courses");
        int totalTeams = reportDAO.getTotalRecords("teams");
        int totalProjects = reportDAO.getTotalRecords("projects");
        int totalCertificates = reportDAO.getTotalRecords("certificates");

        setTitle("YEP Reports Dashboard");
        setSize(950, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240, 244, 248));

        // TITLE
        JLabel title = new JLabel("YOUTH EMPOWERMENT PROJECT REPORTS");
        title.setBounds(180, 20, 600, 40);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setForeground(new Color(25, 118, 210));
        add(title);

        // USERS CARD
        JPanel usersCard = createCard(
                "TOTAL USERS",
                String.valueOf(totalUsers),
                new Color(52, 152, 219));
        usersCard.setBounds(40, 100, 250, 130);
        add(usersCard);

        // COURSES CARD
        JPanel coursesCard = createCard(
                "TOTAL COURSES",
                String.valueOf(totalCourses),
                new Color(46, 204, 113));
        coursesCard.setBounds(340, 100, 250, 130);
        add(coursesCard);

        // TEAMS CARD
        JPanel teamsCard = createCard(
                "TOTAL TEAMS",
                String.valueOf(totalTeams),
                new Color(155, 89, 182));
        teamsCard.setBounds(640, 100, 250, 130);
        add(teamsCard);

        // PROJECTS CARD
        JPanel projectsCard = createCard(
                "TOTAL PROJECTS",
                String.valueOf(totalProjects),
                new Color(230, 126, 34));
        projectsCard.setBounds(190, 300, 250, 130);
        add(projectsCard);

        // CERTIFICATES CARD
        JPanel certificatesCard = createCard(
                "TOTAL CERTIFICATES",
                String.valueOf(totalCertificates),
                new Color(231, 76, 60));
        certificatesCard.setBounds(500, 300, 250, 130);
        add(certificatesCard);

        // FOOTER
        JLabel footer = new JLabel("Youth Empowerment Project Management System");
        footer.setBounds(280, 500, 400, 30);
        footer.setForeground(Color.GRAY);
        footer.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        add(footer);
        // BACK BUTTON
javax.swing.JButton btnBack = new javax.swing.JButton("← Back");

btnBack.setBounds(20, 20, 100, 35);
btnBack.setFont(new Font("Segoe UI", Font.BOLD, 14));
btnBack.setBackground(new Color(52, 152, 219));
btnBack.setForeground(Color.WHITE);
btnBack.setFocusPainted(false);

btnBack.addActionListener(e -> {
    dispose(); // closes reports page

    // Opens Dashboard
    new Dashboard(); 
});

add(btnBack);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private JPanel createCard(String titleText, String valueText, Color color) {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.setBackground(Color.WHITE);

        panel.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(color, 3),
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        JLabel title = new JLabel(titleText);
        title.setBounds(15, 15, 200, 25);
        title.setForeground(color);
        title.setFont(new Font("Segoe UI", Font.BOLD, 16));

        JLabel value = new JLabel(valueText);
        value.setBounds(15, 45, 200, 50);
        value.setHorizontalAlignment(SwingConstants.CENTER);
        value.setFont(new Font("Segoe UI", Font.BOLD, 36));
        value.setForeground(Color.DARK_GRAY);

        panel.add(title);
        panel.add(value);

        return panel;
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports();
            }
        });

    }
}