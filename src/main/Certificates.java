package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Certificates {

    public Certificates() {

        JFrame frame = new JFrame("Certificates");

        JLabel title = new JLabel("Certificate Center");
        title.setBounds(120,20,200,30);

        JButton generate =
                new JButton("Generate Certificate");

        generate.setBounds(80,80,220,40);

        JButton view =
                new JButton("View Certificate");

        view.setBounds(80,140,220,40);

        JButton download =
                new JButton("Download Certificate");

        download.setBounds(80,200,220,40);

        frame.add(title);
        frame.add(generate);
        frame.add(view);
        frame.add(download);

        frame.setSize(420,350);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);
    }
}