package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Projects {

    public Projects() {

        JFrame frame = new JFrame("Projects");

        JLabel title = new JLabel("Project Management");
        title.setBounds(120,20,200,30);

        JButton submitProject =
                new JButton("Submit Project");

        submitProject.setBounds(80,80,200,40);

        JButton viewProjects =
                new JButton("View Projects");

        viewProjects.setBounds(80,140,200,40);

        JButton projectStatus =
                new JButton("Project Status");

        projectStatus.setBounds(80,200,200,40);

        frame.add(title);
        frame.add(submitProject);
        frame.add(viewProjects);
        frame.add(projectStatus);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);
    }
}