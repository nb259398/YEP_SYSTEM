package main;

import dao.ProjectDAO;
import javax.swing.*;

public class SubmitProject {

    public SubmitProject() {

        JFrame frame =
                new JFrame("Submit Project");

        JLabel lblTitle =
                new JLabel("Project Title");

        lblTitle.setBounds(20,40,100,30);

        JTextField txtTitle =
                new JTextField();

        txtTitle.setBounds(130,40,200,30);

        JLabel lblDesc =
                new JLabel("Description");

        lblDesc.setBounds(20,90,100,30);

        JTextField txtDesc =
                new JTextField();

        txtDesc.setBounds(130,90,200,30);

        JButton submit =
                new JButton("Submit");

        submit.setBounds(130,150,120,30);

        submit.addActionListener(e -> {

            String title =
                    txtTitle.getText();

            String description =
                    txtDesc.getText();

            ProjectDAO dao =
                    new ProjectDAO();

            boolean success =
                    dao.submitProject(
                            title,
                            description,
                            "Pending"
                    );

            if(success){

                JOptionPane.showMessageDialog(
                        null,
                        "Project Submitted Successfully"
                );

            }else{

                JOptionPane.showMessageDialog(
                        null,
                        "Submission Failed"
                );
            }
        });

        frame.add(lblTitle);
        frame.add(txtTitle);

        frame.add(lblDesc);
        frame.add(txtDesc);

        frame.add(submit);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}