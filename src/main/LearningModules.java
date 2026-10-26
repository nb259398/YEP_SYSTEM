package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LearningModules {

    public LearningModules() {

        JFrame frame = new JFrame("Learning Modules");

        JLabel title = new JLabel("Available Courses");
        title.setBounds(120,20,200,30);

        JLabel c1 = new JLabel("1. Digital Literacy");
        c1.setBounds(50,70,200,30);

        JLabel c2 = new JLabel("2. AI Literacy");
        c2.setBounds(50,110,200,30);

        JLabel c3 = new JLabel("3. Media Literacy");
        c3.setBounds(50,150,200,30);

        JLabel c4 = new JLabel("4. Web Development");
        c4.setBounds(50,190,200,30);

        frame.add(title);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
