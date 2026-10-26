package main;

import dao.TeamDAO;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Teams {

    public Teams() {

        JFrame frame =
                new JFrame("Teams");

        JLabel title =
                new JLabel("Available Teams");
        javax.swing.JButton createTeam =
        new javax.swing.JButton("Create Team");

createTeam.setBounds(230,20,120,30);

createTeam.addActionListener(e -> {
    new CreateTeam();
});

frame.add(createTeam);

        title.setBounds(120,20,200,30);

        frame.add(title);

        try {

            TeamDAO dao =
                    new TeamDAO();

            ResultSet rs =
                    dao.getTeams();

            int y = 80;

            while(rs.next()) {

                JLabel team =
                        new JLabel(
                                rs.getString("team_name")
                        );

                team.setBounds(50,y,300,30);

                frame.add(team);

                y += 40;
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}