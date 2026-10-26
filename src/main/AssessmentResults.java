package main;

import dao.AssessmentResultDAO;
import javax.swing.*;

public class AssessmentResults {

    public AssessmentResults() {

        JFrame frame =
                new JFrame("Assessment Results");
        JLabel lblUser =
        new JLabel("User ID");

   lblUser.setBounds(20,10,120,30);

    JTextField txtUser =
        new JTextField();

   txtUser.setBounds(150,10,180,30);

        JLabel lblTitle =
                new JLabel("Assessment Title");

        lblTitle.setBounds(20,40,120,30);

        JTextField txtTitle =
                new JTextField();

        txtTitle.setBounds(150,40,180,30);

        JLabel lblScore =
                new JLabel("Score");

        lblScore.setBounds(20,90,120,30);

        JTextField txtScore =
                new JTextField();

        txtScore.setBounds(150,90,180,30);

        JLabel lblFeedback =
                new JLabel("Feedback");

        lblFeedback.setBounds(20,140,120,30);

        JTextField txtFeedback =
                new JTextField();

        txtFeedback.setBounds(150,140,180,30);

        JButton btnSave =
                new JButton("Save Result");

        btnSave.setBounds(150,200,120,30);

        btnSave.addActionListener(e -> {

            int user_Id =
        Integer.parseInt(
                txtUser.getText()
        );

  String title =
        txtTitle.getText();

            int score =
                    Integer.parseInt(
                            txtScore.getText()
                    );

            String feedback =
                    txtFeedback.getText();

            AssessmentResultDAO dao =
                    new AssessmentResultDAO();

            boolean success =
                    dao.saveResult(
                            user_Id,
                            title,
                            score,
                            feedback
                    );

            if(success){

                JOptionPane.showMessageDialog(
                        null,
                        "Assessment Saved Successfully"
                );

            }else{

                JOptionPane.showMessageDialog(
                        null,
                        "Save Failed"
                );
            }
        });

        frame.add(lblTitle);
        frame.add(txtTitle);

        frame.add(lblScore);
        frame.add(txtScore);

        frame.add(lblFeedback);
        frame.add(txtFeedback);

        frame.add(lblUser);
        frame.add(txtUser);

        frame.add(btnSave);

        frame.setSize(420,320);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}