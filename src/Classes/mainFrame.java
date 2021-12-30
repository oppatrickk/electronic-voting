// Package
package Classes;

// Imports
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// mainFrame Class
public class mainFrame extends JFrame{
    // GUI
    private JPanel mainPanel;
    private JButton voteButton;
    private JButton listOfCandidatesButton;
    private JButton tallyButton;
    private JButton fileCandidacyButton;

    // Constructor
    public mainFrame(){
        setContentPane(mainPanel);
        setTitle("Electronic Voting System");
        setSize(720, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(new java.awt.Color(38,44,59));
        setLocationRelativeTo(null);

        // Listener
        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                voterFrame myApp = new voterFrame();
            }
        });

        fileCandidacyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                filingFrame myApp = new filingFrame();
            }
        });

        listOfCandidatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                candidateFrame myApp = new candidateFrame();
            }
        });

        tallyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                voterListFrame myApp = new voterListFrame();
            }
        });
    }
}
