package main;

import dao.EnrollmentDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CourseEnrollment {

    public CourseEnrollment() {

        JFrame frame = new JFrame("YEP - Course Enrollment");

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
                new JLabel("Enroll in a Learning Module");

        subtitle.setBounds(190, 60, 250, 25);

        subtitle.setFont(
                new Font("Segoe UI", Font.BOLD, 16));

        subtitle.setForeground(
                new Color(100, 100, 100));

        frame.add(subtitle);

        // ====================================
        // COURSE ID LABEL
        // ====================================

        JLabel lblCourse =
                new JLabel("Course ID");

        lblCourse.setBounds(120, 130, 120, 30);

        lblCourse.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        frame.add(lblCourse);

        // ====================================
        // COURSE ID FIELD
        // ====================================

        JTextField txtCourse =
                new JTextField();

        txtCourse.setBounds(250, 130, 180, 35);

        txtCourse.setFont(
                new Font("Segoe UI", Font.PLAIN, 14));

        frame.add(txtCourse);

        // ====================================
        // ENROLL BUTTON
        // ====================================

        JButton btnEnroll =
                new JButton("📚 Enroll Now");

        btnEnroll.setBounds(
                180,
                210,
                220,
                40);

        btnEnroll.setBackground(
                new Color(22, 163, 74));

        btnEnroll.setForeground(
                Color.WHITE);

        btnEnroll.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        btnEnroll.setFocusPainted(false);

        btnEnroll.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        btnEnroll.addActionListener(e -> {

            try {

                int userId = 1;

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
                            "Enrollment Successful!"
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Enrollment Failed!"
                    );
                }

            } catch(NumberFormatException ex){

                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a valid Course ID."
                );
            }

        });

        frame.add(btnEnroll);

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

        btnBack.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(btnBack);

        // ====================================
        // FOOTER
        // ====================================

        JLabel footer =
                new JLabel(
                        "Empowering Youth Through Learning & Innovation"
                );

        footer.setBounds(
                125,
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