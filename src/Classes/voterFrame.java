// Packages
package Classes;

// Imports
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

// voterFrameClass
public class voterFrame extends JFrame{
    // GUI
    private JButton returnButton;
    private JButton submitButton;
    private JTextField inputFirstName;
    private JTextField inputLastName;
    private JPanel voterPanel;
    private JComboBox birthDate;
    private JLabel error1;
    private JLabel error2;
    private JLabel error3;
    private JLabel success;


    // Constructor
    public voterFrame() {
        setContentPane(voterPanel);
        setTitle("Electronic Voting System");
        setSize(720, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(new java.awt.Color(38,44,59));
        setLocationRelativeTo(null);

        inputFirstName.setBackground(new java.awt.Color(32,37,49));
        inputFirstName.setBorder(new LineBorder(Color.black,1));
        inputFirstName.setForeground(Color.lightGray);

        inputLastName.setBackground(new java.awt.Color(32,37,49));
        inputLastName.setBorder(new LineBorder(Color.black,1));
        inputLastName.setForeground(Color.lightGray);

        birthDate.setBackground(new java.awt.Color(32,37,49));
        birthDate.setBorder(new LineBorder(Color.black,1));
        birthDate.setForeground(Color.lightGray);

        // Listeners
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                mainFrame myApp = new mainFrame();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Variables
                int check = 0;

                if(inputFirstName.getText() == null || inputFirstName.getText().isEmpty()){
                    error1.setText("Enter your First Name");
                }
                else if(inputFirstName.getText().matches("\\d+")){
                    error1.setText("Invalid First Name");
                }
                else{
                    error1.setText("");
                    check++;
                }

                if(inputLastName.getText() == null || inputLastName.getText().isEmpty()){
                    error2.setText("Enter your Last Name");
                }
                else if(inputLastName.getText().matches("\\d+")){
                    error2.setText("Invalid Last Name");
                }
                else{
                    error2.setText("");
                    check++;
                }

                switch(Objects.requireNonNull(birthDate.getSelectedItem()).toString()){
                    case "- SELECT -":
                        error3.setText("Select your birthdate");
                        break;
                    case "2022":
                    case "2021":
                    case "2020":
                    case "2019":
                    case "2018":
                    case "2017":
                    case "2016":
                    case "2015":
                    case "2014":
                    case "2013":
                    case "2012":
                    case "2011":
                    case "2010":
                    case "2009":
                    case "2008":
                    case "2007":
                    case "2006":
                    case "2005":
                        error3.setText("You must be 18+ to vote");
                        break;
                    default:
                        error3.setText("");
                        check++;
                        break;
                }

                if(check == 3){
                    Voter.firstName[Voter.count] = inputFirstName.getText().substring(0, 1).toUpperCase() + inputFirstName.getText().substring(1);
                    Voter.lastName[Voter.count] = inputLastName.getText().substring(0, 1).toUpperCase() + inputLastName.getText().substring(1);
                    Voter.year[Voter.count] = birthDate.getSelectedItem().toString();
                    Voter.count++;

                    success.setText("Voter Registered!");
                    inputFirstName.setText("");
                    inputLastName.setText("");
                    birthDate.setSelectedIndex(0);
                }
                else{
                    success.setText("");
                }
            }
        });
    }
}
