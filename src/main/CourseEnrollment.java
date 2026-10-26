package main;

import dao.EnrollmentDAO;
import javax.swing.*;

public class CourseEnrollment {

    public CourseEnrollment() {

        JFrame frame =
                new JFrame("Course Enrollment");

        JLabel lblCourse =
                new JLabel("Course ID:");

        lblCourse.setBounds(30,50,100,30);

        JTextField txtCourse =
                new JTextField();

        txtCourse.setBounds(120,50,150,30);

        JButton btnEnroll =
                new JButton("Enroll");

        btnEnroll.setBounds(120,100,120,30);

        btnEnroll.addActionListener(e -> {

            int userId = 1; // Admin user for testing

            int courseId =
                    Integer.parseInt(
                            txtCourse.getText()
                    );

            EnrollmentDAO dao =
                    new EnrollmentDAO();

            boolean success =
                    dao.enrollCourse(
                            userId,
                            courseId
                    );

            if(success){

                JOptionPane.showMessageDialog(
                        null,
                        "Enrollment Successful"
                );

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Enrollment Failed"
                );
            }

        });

        frame.add(lblCourse);
        frame.add(txtCourse);
        frame.add(btnEnroll);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}