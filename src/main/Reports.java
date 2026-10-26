package main;

import dao.ReportDAO;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Reports {

    public Reports() {

        JFrame frame = new JFrame("YEP Reports");

        ReportDAO reportDAO = new ReportDAO();

        int totalUsers =
                reportDAO.getTotalRecords("users");

        int totalCourses =
                reportDAO.getTotalRecords("courses");

        int totalTeams =
                reportDAO.getTotalRecords("teams");

        int totalProjects =
                reportDAO.getTotalRecords("projects");

        int totalCertificates =
                reportDAO.getTotalRecords("certificates");

        JLabel title =
                new JLabel("YOUTH EMPOWERMENT PROJECT REPORT");

        title.setBounds(70,20,300,30);

        JLabel users =
                new JLabel("Total Users: " + totalUsers);

        users.setBounds(50,80,250,30);

        JLabel courses =
                new JLabel("Total Courses: " + totalCourses);

        courses.setBounds(50,120,250,30);

        JLabel teams =
                new JLabel("Total Teams: " + totalTeams);

        teams.setBounds(50,160,250,30);

        JLabel projects =
                new JLabel("Total Projects: " + totalProjects);

        projects.setBounds(50,200,250,30);

        JLabel certificates =
                new JLabel("Total Certificates: " + totalCertificates);

        certificates.setBounds(50,240,250,30);

        frame.add(title);
        frame.add(users);
        frame.add(courses);
        frame.add(teams);
        frame.add(projects);
        frame.add(certificates);

        frame.setSize(450,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}