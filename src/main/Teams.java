package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Teams {

    public Teams() {

        JFrame frame = new JFrame("Teams");

        JLabel title = new JLabel("Team Management");
        title.setBounds(120,20,200,30);

        JButton createTeam = new JButton("Create Team");
        createTeam.setBounds(80,80,200,40);

        JButton joinTeam = new JButton("Join Team");
        joinTeam.setBounds(80,140,200,40);

        JButton viewTeams = new JButton("View Teams");
        viewTeams.setBounds(80,200,200,40);

        frame.add(title);
        frame.add(createTeam);
        frame.add(joinTeam);
        frame.add(viewTeams);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}