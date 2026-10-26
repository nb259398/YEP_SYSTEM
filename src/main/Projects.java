package main;

import dao.ProjectDAO;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Projects {

    public Projects() {

        JFrame frame =
            new JFrame("Projects");

        JLabel title =
            new JLabel("Available Projects");

        title.setBounds(120,20,200,30);

        frame.add(title);
        JButton submitProject =
        new JButton("Submit Project");

     submitProject.setBounds(300,20,150,30);

     submitProject.addActionListener(e -> {
     new SubmitProject();
});

     frame.add(submitProject);

        try {

            ProjectDAO dao =
                new ProjectDAO();

            ResultSet rs =
                dao.getProjects();

            int y = 70;

            while(rs.next()) {

                JLabel project =
                    new JLabel(
                        rs.getString("title")
                        + " (" +
                        rs.getString("status")
                        + ")"
                    );

                project.setBounds(30,y,350,30);

                frame.add(project);

                y += 40;
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
            JFrame.DISPOSE_ON_CLOSE
        );
    }
}