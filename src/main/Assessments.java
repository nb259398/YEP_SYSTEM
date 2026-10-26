package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Assessments {

    public Assessments() {

        JFrame frame = new JFrame("Assessments");

        JLabel title = new JLabel("Assessment Center");
        title.setBounds(120,20,200,30);

        JButton takeTest = new JButton("Take Assessment");
        takeTest.setBounds(80,80,200,40);

        JButton viewScore = new JButton("View Score");
        viewScore.setBounds(80,140,200,40);

        JButton feedback = new JButton("Feedback");
        feedback.setBounds(80,200,200,40);

        frame.add(title);
        frame.add(takeTest);
        frame.add(viewScore);
        frame.add(feedback);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}