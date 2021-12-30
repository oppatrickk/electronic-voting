// Packages
package Classes;

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

// adminFrame Class
public class adminFrame extends JFrame{
    // GUI
    private JButton startElectionButton;
    private JButton endElectionButton;
    private JPanel adminPanel;
    private JLabel errorMsg;
    private JLabel statusMsg;

    // Constructor
    public adminFrame(){
        setContentPane(adminPanel);
        setTitle("Electronic Voting System");
        setSize(420, 420);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(new java.awt.Color(38, 44, 59));

        // Listener
        startElectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Voter.count >= 24){
                    if(Candidate.qualifiedSenatorCount >= 12){

                        if(Candidate.qualifiedVicePresCount >= 2){
                            if(Candidate.qualifiedPresidentCount >=2){
                                statusMsg.setText("Current Status: Election Period");
                                errorMsg.setText("");

                                Arrays.asList(Window.getWindows()).forEach(b -> b.dispose());
                                Election.electionPeriod = true;
                                electionFrame myApp = new electionFrame();
                                adminFrame adminApp = new adminFrame();

                            }
                            else{
                                errorMsg.setText("There must be at least 2 qualified candidate for President");
                            }
                        }
                        else{
                            errorMsg.setText("There must be at least 2 qualified candidate for Vice-President");
                        }
                    }
                    else{
                        errorMsg.setText("There must be at least 12 qualified candidate for Senators");
                    }
                }
                else{
                    errorMsg.setText("There must be at least 25 voters");
                }
            }
        });
        endElectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                statusMsg.setText("Current Status: Election Period");
                errorMsg.setText("");

                Arrays.asList(Window.getWindows()).forEach(b -> b.dispose());
                Election.electionPeriod = true;
                electionFrame myApp = new electionFrame();
                adminFrame adminApp = new adminFrame();

                /*
                if(Election.electionPeriod){
                    statusMsg.setText("Current Status: Election Ended");
                }
                else{
                    errorMsg.setText("The election has not yet started");
                }
                 */

            }
        });
    }
}
