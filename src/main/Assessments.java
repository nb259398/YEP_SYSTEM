package main;

import dao.AssessmentDAO;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Assessments {

    public Assessments() {

        JFrame frame =
                new JFrame("Assessments");

        JLabel title =
                new JLabel("Assessment Center");

        title.setBounds(120,20,200,30);

        frame.add(title);
        JButton resultsButton =
        new JButton("Add Result");

     resultsButton.setBounds(300,20,120,30);

     resultsButton.addActionListener(e -> {
      new AssessmentResults();
});

    frame.add(resultsButton);

        try {

            AssessmentDAO dao =
                    new AssessmentDAO();

            ResultSet rs =
                    dao.getAssessments();

            int y = 80;

            boolean hasData = false;

            while(rs.next()) {

                hasData = true;

                JLabel assessment =
                        new JLabel(
                                rs.getString("title")
                        );

                assessment.setBounds(50,y,300,30);

                frame.add(assessment);

                y += 40;
            }

            if(!hasData){

                JLabel empty =
                        new JLabel(
                                "No assessments available yet."
                        );

                empty.setBounds(50,80,250,30);

                frame.add(empty);
            }

        } catch(Exception e){

            e.printStackTrace();
        }

        frame.setSize(450,350);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}