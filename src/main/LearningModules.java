package main;

import dao.CourseDAO;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LearningModules {

    public LearningModules() {

        JFrame frame =
                new JFrame("Learning Modules");

        JLabel title =
                new JLabel("Available Courses");

        title.setBounds(120,20,200,30);

        frame.add(title);

        try {

            CourseDAO dao =
                    new CourseDAO();

            ResultSet rs =
                    dao.getCourses();

            int y = 70;

            while(rs.next()) {

                JLabel course =
                        new JLabel(
                                rs.getString("title")
                        );

                course.setBounds(50,y,300,30);

                frame.add(course);

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