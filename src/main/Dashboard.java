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
        courses.addActionListener(e -> {
    new LearningModules();
    });

        JButton teams = new JButton("Teams");
        teams.setBounds(80, 140, 200, 40);
        teams.addActionListener(e -> {
    new Teams();
});

        JButton projects = new JButton("Projects");
        projects.setBounds(80, 200, 200, 40);
        projects.addActionListener(e -> {
    new Projects();
});
        JButton assessments = new JButton("Assessments");
         assessments.setBounds(80, 260, 200, 40);

        assessments.addActionListener(e -> {
         new Assessments();
});

        JButton certificates = new JButton("Certificates");
        certificates.setBounds(80, 320, 200, 40);
        certificates.addActionListener(e -> {
    new Certificates();
});
        JButton reports = new JButton("Reports");

       reports.setBounds(80,380,200,40);

       reports.addActionListener(e -> {
    new Reports();
});

        frame.add(reports);
        frame.add(title);
        frame.add(courses);
        frame.add(teams);
        frame.add(projects);
        frame.add(assessments);
        frame.add(certificates);

        frame.setSize(450, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}