// Package
package Classes;

// Imports
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// electionFrame Class
public class electionFrame extends JFrame{
    // GUI
    private JPanel electionPanel;
    private JPanel mainPanel;
    private JButton voteButton;
    private JButton listOfCandidatesButton;
    private JButton tallyButton;
    private JButton partialTallyButton;

    // Constructor
    public electionFrame(){
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

                votingFrame myApp = new votingFrame();
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

        partialTallyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                tallyFrame myApp = new tallyFrame();
            }
        });
    }
}
