// Package
package Classes;

// Imports
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

// filingFrame Class
public class filingFrame extends JFrame{
    // GUI
    private JPanel filingPanel;
    private JTextField inputFirstName;
    private JTextField inputLastName;
    private JTextField inputPoliticalParty;
    private JComboBox position;
    private JComboBox educationalBackground;
    private JRadioButton yesRadioButton;
    private JRadioButton noRadioButton;
    private JButton submitButton;
    private JButton returnButton;
    private JTextField inputCriminalCases;
    private JLabel successMsg;
    private JLabel error1;
    private JLabel error2;
    private JLabel error3;
    private JLabel error4;
    private JLabel error5;
    private JLabel error6;
    private JLabel error7;

    // Variables
    String errorMsg;

    // Constructor
    public filingFrame(){
        setContentPane(filingPanel);
        setTitle("Electronic Voting System");
        setSize(720, 720);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(38,44,59));

        // Radio Button Group
        ButtonGroup group = new ButtonGroup();
        group.add(yesRadioButton);
        group.add(noRadioButton);

        inputFirstName.setBackground(new java.awt.Color(32,37,49));
        inputFirstName.setBorder(new LineBorder(Color.black,1));
        inputFirstName.setForeground(Color.lightGray);

        inputLastName.setBackground(new java.awt.Color(32,37,49));
        inputLastName.setBorder(new LineBorder(Color.black,1));
        inputLastName.setForeground(Color.lightGray);

        inputPoliticalParty.setBackground(new java.awt.Color(32,37,49));
        inputPoliticalParty.setBorder(new LineBorder(Color.black,1));
        inputPoliticalParty.setForeground(Color.lightGray);

        position.setBackground(new java.awt.Color(32,37,49));
        position.setBorder(new LineBorder(Color.black,1));
        position.setForeground(Color.lightGray);

        educationalBackground.setBackground(new java.awt.Color(32,37,49));
        educationalBackground.setBorder(new LineBorder(Color.black,1));
        educationalBackground.setForeground(Color.lightGray);

        yesRadioButton.setBackground(new java.awt.Color(38,44,59));
        yesRadioButton.setForeground(Color.white);

        noRadioButton.setBackground(new java.awt.Color(38,44,59));
        noRadioButton.setForeground(Color.white);

        inputCriminalCases.setBackground(new java.awt.Color(32,37,49));
        inputCriminalCases.setBorder(new LineBorder(Color.black,1));
        inputCriminalCases.setForeground(Color.lightGray);

        // Listener
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
                String firstNameValue = inputFirstName.getText();
                String lastNameValue = inputLastName.getText();
                String politicalPartyValue = inputPoliticalParty.getText();
                String criminalCasesValue = inputCriminalCases.getText();
                String criminal = "NO";
                String qualification = "YES";

                int check = 0;
                boolean checkCriminalCase = false;

                // First name
                if(firstNameValue == null || firstNameValue.isEmpty()){
                    error1.setText("Please enter First name");
                }
                else if(firstNameValue.matches("\\d+")){
                    error1.setText("Invalid Name");
                }
                else{
                    error1.setText("");
                    check++;
                }

                // Last Name
                if(lastNameValue == null || lastNameValue.isEmpty()){
                    error2.setText("Please enter Last name");
                }
                else if(lastNameValue.matches("\\d+")){
                    error2.setText("Invalid Name");
                }
                else{
                    error2.setText("");
                    check++;
                }

                // Political Party
                if(politicalPartyValue == null || politicalPartyValue.isEmpty()){
                    error3.setText("Please enter Political Party");
                }
                else{
                    error3.setText("");
                    check++;
                }

                // Educational Background
                switch(Objects.requireNonNull(educationalBackground.getSelectedItem()).toString()){
                    case "- SELECT -":
                        error4.setText("Please select Educational Background");
                        break;
                    default:
                        error4.setText("");
                        check++;
                        break;
                }

                // Position
                switch(Objects.requireNonNull(position.getSelectedItem()).toString()){
                    case "- SELECT -":
                        error5.setText("Please select Position");
                        break;
                    default:
                        error5.setText("");
                        check++;
                        break;
                }

                // Criminal Record
                if(yesRadioButton.isSelected()){
                    checkCriminalCase = true;
                    criminal = "YES";
                    qualification = "NO";
                    error7.setText("");
                }
                else if(noRadioButton.isSelected()){
                    criminalCasesValue = "-";
                    check++;
                    error7.setText("");
                }
                else{
                    error7.setText("Please select Yes or No");
                }

                // Criminal Cases
                if(checkCriminalCase){
                    if(politicalPartyValue == null || politicalPartyValue.isEmpty()){
                        error6.setText("Specify Criminal Case/s");
                    }
                    else{
                        error6.setText("");
                        check++;
                    }
                }

                // Final Check
                if(check == 6){
                    if(Objects.equals(Objects.requireNonNull(position.getSelectedItem()).toString(), "President")){
                        Candidate.presidentCount++;
                        if(!Objects.equals(Objects.requireNonNull(educationalBackground.getSelectedItem()).toString(), "Doctorate Degree")){
                            qualification = "NO";
                        }
                        else{
                            Candidate.qualifiedPresidentCount++;
                        }
                    }
                    else if (Objects.equals(Objects.requireNonNull(position.getSelectedItem()).toString(), "Vice-President")){
                        Candidate.vicepresCount++;
                        if(!Objects.equals(Objects.requireNonNull(educationalBackground.getSelectedItem()).toString(), "Doctorate Degree")){
                            qualification = "NO";
                        }
                        else{
                            Candidate.qualifiedVicePresCount++;
                        }
                    }
                    else if (Objects.equals(Objects.requireNonNull(position.getSelectedItem()).toString(), "Senator")){
                        Candidate.senatorCount++;
                        if(Objects.equals(Objects.requireNonNull(educationalBackground.getSelectedItem()).toString(), "Doctorate Degree") ||
                                Objects.equals(Objects.requireNonNull(educationalBackground.getSelectedItem()).toString(), "Master Degree")){
                            Candidate.qualifiedSenatorCount++;
                        }
                        else{
                            qualification = "NO";
                        }
                    }

                    // Set
                    Candidate.firstName[Candidate.count] = firstNameValue.substring(0, 1).toUpperCase() + firstNameValue.substring(1);
                    Candidate.lastName[Candidate.count] = lastNameValue.substring(0, 1).toUpperCase() + lastNameValue.substring(1);
                    Candidate.politicalParty[Candidate.count] = politicalPartyValue;

                    Candidate.educationalBackground[Candidate.count] = Objects.requireNonNull(educationalBackground.getSelectedItem()).toString();
                    Candidate.position[Candidate.count] = Objects.requireNonNull(position.getSelectedItem()).toString();
                    Candidate.criminalRecord[Candidate.count] = criminal;
                    Candidate.criminalCase[Candidate.count] = criminalCasesValue;
                    Candidate.qualified[Candidate.count] = qualification;

                    Candidate.count++;
                    successMsg.setText("Candidate Registered!");

                    // Reset
                    inputFirstName.setText("");
                    inputLastName.setText("");
                    inputPoliticalParty.setText("");
                    educationalBackground.setSelectedIndex(0);
                    position.setSelectedIndex(0);
                    yesRadioButton.setSelected(false);
                    noRadioButton.setSelected(false);
                    inputCriminalCases.setText("");
                    group.clearSelection();
                }
            }
        });
    }
}
