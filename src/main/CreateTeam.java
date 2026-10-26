package main;

import dao.TeamDAO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreateTeam {

    public CreateTeam() {

        JFrame frame =
                new JFrame("Create Team");

        JLabel lblName =
                new JLabel("Team Name:");

        lblName.setBounds(30,50,100,30);

        JTextField txtName =
                new JTextField();

        txtName.setBounds(120,50,180,30);

        JButton btnCreate =
                new JButton("Create Team");

        btnCreate.setBounds(120,100,150,30);

        btnCreate.addActionListener(e -> {

            String teamName =
                    txtName.getText();

            TeamDAO dao =
                    new TeamDAO();

            boolean success =
                    dao.createTeam(teamName);

            if(success){

                JOptionPane.showMessageDialog(
                        null,
                        "Team Created Successfully"
                );

            }else{

                JOptionPane.showMessageDialog(
                        null,
                        "Failed to Create Team"
                );
            }
        });

        frame.add(lblName);
        frame.add(txtName);
        frame.add(btnCreate);

        frame.setSize(400,250);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );
    }
}