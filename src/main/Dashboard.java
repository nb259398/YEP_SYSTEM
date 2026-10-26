package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dashboard {

    public Dashboard() {

        JFrame frame = new JFrame("YEP Dashboard");

        JLabel title = new JLabel("YOUTH EMPOWERMENT PROJECT");
        title.setBounds(80, 20, 250, 30);

        JButton courses = new JButton("Learning Modules");
        courses.setBounds(80, 80, 200, 40);

        JButton teams = new JButton("Teams");
        teams.setBounds(80, 140, 200, 40);

        JButton projects = new JButton("Projects");
        projects.setBounds(80, 200, 200, 40);

        JButton certificates = new JButton("Certificates");
        certificates.setBounds(80, 260, 200, 40);

        frame.add(title);
        frame.add(courses);
        frame.add(teams);
        frame.add(projects);
        frame.add(certificates);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}