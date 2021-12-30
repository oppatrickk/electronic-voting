// Packages
package Classes;

// Imports
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

// votingFrame Class
public class votingFrame extends JFrame{
    // GUI
    private JComboBox presidentBox;
    private JComboBox vicepresBox;
    private JPanel votingPanel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;
    private JComboBox comboBox8;
    private JComboBox comboBox9;
    private JComboBox comboBox10;
    private JComboBox comboBox11;
    private JComboBox comboBox12;
    private JButton returnButton;
    private JButton submitButton;
    private JTextField inputFirstName;
    private JTextField inputLastName;
    private JLabel error1;
    private JLabel error2;
    private JLabel error3;
    private JLabel error4;
    private JLabel error5;
    private JLabel successMsg;


    // Constructor
    public votingFrame(){
        setContentPane(votingPanel);
        setTitle("Electronic Voting System");
        setSize(720, 720);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(38,44,59));

        presidentBox.setBackground(new java.awt.Color(32,37,49));
        presidentBox.setBorder(new LineBorder(Color.black,1));
        presidentBox.setForeground(Color.lightGray);

        vicepresBox.setBackground(new java.awt.Color(32,37,49));
        vicepresBox.setBorder(new LineBorder(Color.black,1));
        vicepresBox.setForeground(Color.lightGray);

        comboBox1.setBackground(new java.awt.Color(32,37,49));
        comboBox1.setBorder(new LineBorder(Color.black,1));
        comboBox1.setForeground(Color.lightGray);

        comboBox2.setBackground(new java.awt.Color(32,37,49));
        comboBox2.setBorder(new LineBorder(Color.black,1));
        comboBox2.setForeground(Color.lightGray);

        comboBox3.setBackground(new java.awt.Color(32,37,49));
        comboBox3.setBorder(new LineBorder(Color.black,1));
        comboBox3.setForeground(Color.lightGray);

        comboBox4.setBackground(new java.awt.Color(32,37,49));
        comboBox4.setBorder(new LineBorder(Color.black,1));
        comboBox4.setForeground(Color.lightGray);

        comboBox5.setBackground(new java.awt.Color(32,37,49));
        comboBox5.setBorder(new LineBorder(Color.black,1));
        comboBox5.setForeground(Color.lightGray);

        comboBox6.setBackground(new java.awt.Color(32,37,49));
        comboBox6.setBorder(new LineBorder(Color.black,1));
        comboBox6.setForeground(Color.lightGray);

        comboBox7.setBackground(new java.awt.Color(32,37,49));
        comboBox7.setBorder(new LineBorder(Color.black,1));
        comboBox7.setForeground(Color.lightGray);

        comboBox8.setBackground(new java.awt.Color(32,37,49));
        comboBox8.setBorder(new LineBorder(Color.black,1));
        comboBox8.setForeground(Color.lightGray);

        comboBox9.setBackground(new java.awt.Color(32,37,49));
        comboBox9.setBorder(new LineBorder(Color.black,1));
        comboBox9.setForeground(Color.lightGray);

        comboBox10.setBackground(new java.awt.Color(32,37,49));
        comboBox10.setBorder(new LineBorder(Color.black,1));
        comboBox10.setForeground(Color.lightGray);

        comboBox11.setBackground(new java.awt.Color(32,37,49));
        comboBox11.setBorder(new LineBorder(Color.black,1));
        comboBox11.setForeground(Color.lightGray);

        comboBox12.setBackground(new java.awt.Color(32,37,49));
        comboBox12.setBorder(new LineBorder(Color.black,1));
        comboBox12.setForeground(Color.lightGray);

        for(int i=0; i <= Candidate.count; i++) {

            if(Objects.equals(Candidate.qualified[i], "YES")){

                if(Objects.equals(Candidate.position[i], "President")){
                    presidentBox.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                }
                else if(Objects.equals(Candidate.position[i], "Vice-President")){
                    vicepresBox.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                }
                else if(Objects.equals(Candidate.position[i], "Senator")){
                    comboBox1.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox2.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox3.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox4.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox5.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox6.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox7.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox8.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox9.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox10.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox11.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                    comboBox12.addItem(Candidate.firstName[i] + " " + Candidate.lastName[i]);
                }
            }
        }

        // Listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                successMsg.setText("");

                String firstNameValue = inputFirstName.getText();
                String lastNameValue = inputLastName.getText();

                int check = 0;
                int i = 0;

                // First name

                if(firstNameValue == null || firstNameValue.isEmpty()){
                    error1.setText("Please enter First Name");
                }
                else{
                    error1.setText("");
                }

                if(lastNameValue == null || lastNameValue.isEmpty()){
                    error2.setText("Please enter Last Name");
                }
                else{
                    error2.setText("");
                }

                firstNameValue = firstNameValue.substring(0, 1).toUpperCase() + firstNameValue.substring(1);
                lastNameValue = lastNameValue.substring(0, 1).toUpperCase() + lastNameValue.substring(1);

                for(i = 0; i <= Voter.count; i++){

                    if((Voter.firstName[i] + " " + Voter.lastName[i]).equals(firstNameValue + " " + lastNameValue)){
                        if(Voter.voted[i] == 1){
                            error1.setText("You already voted!");
                        }
                        else{
                            error1.setText("");
                            check++;
                        }
                        break;
                    }
                    else{
                        error1.setText("Name not Found!");
                    }
                }

                // President
                if ("- SELECT -".equals(Objects.requireNonNull(presidentBox.getSelectedItem()).toString())) {
                    error3.setText("Please select President");
                } else {
                    error3.setText("");
                    check++;
                }

                // Vice President
                if ("- SELECT -".equals(Objects.requireNonNull(vicepresBox.getSelectedItem()).toString())) {
                    error4.setText("Please select Vice-President");
                } else {
                    error4.setText("");
                    check++;
                }

                // Senators
                if ("- SELECT -".equals(Objects.requireNonNull(comboBox1.getSelectedItem()).toString())) {
                    error5.setText("Please complete Senator Selection");
                } else {
                    if ("- SELECT -".equals(Objects.requireNonNull(comboBox2.getSelectedItem()).toString())) {
                        error5.setText("Please complete Senator Selection");
                    } else {
                        if ("- SELECT -".equals(Objects.requireNonNull(comboBox3.getSelectedItem()).toString())) {
                            error5.setText("Please complete Senator Selection");
                        } else {
                            if ("- SELECT -".equals(Objects.requireNonNull(comboBox4.getSelectedItem()).toString())) {
                                error5.setText("Please complete Senator Selection");
                            } else {
                                if ("- SELECT -".equals(Objects.requireNonNull(comboBox5.getSelectedItem()).toString())) {
                                    error5.setText("Please complete Senator Selection");
                                } else {
                                    if ("- SELECT -".equals(Objects.requireNonNull(comboBox6.getSelectedItem()).toString())) {
                                        error5.setText("Please complete Senator Selection");
                                    } else {
                                        if ("- SELECT -".equals(Objects.requireNonNull(comboBox7.getSelectedItem()).toString())) {
                                            error5.setText("Please complete Senator Selection");
                                        } else {
                                            if ("- SELECT -".equals(Objects.requireNonNull(comboBox8.getSelectedItem()).toString())) {
                                                error5.setText("Please complete Senator Selection");
                                            } else {
                                                if ("- SELECT -".equals(Objects.requireNonNull(comboBox9.getSelectedItem()).toString())) {
                                                    error5.setText("Please complete Senator Selection");
                                                } else {
                                                    if ("- SELECT -".equals(Objects.requireNonNull(comboBox10.getSelectedItem()).toString())) {
                                                        error5.setText("Please complete Senator Selection");
                                                    } else {
                                                        if ("- SELECT -".equals(Objects.requireNonNull(comboBox11.getSelectedItem()).toString())) {
                                                            error5.setText("Please complete Senator Selection");
                                                        } else {
                                                            if ("- SELECT -".equals(Objects.requireNonNull(comboBox12.getSelectedItem()).toString())) {
                                                                error5.setText("Please complete Senator Selection");
                                                            } else {
                                                                error5.setText("");
                                                                check++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                String combo1 = Objects.requireNonNull(comboBox1.getSelectedItem()).toString();
                String combo2 = Objects.requireNonNull(comboBox2.getSelectedItem()).toString();
                String combo3 = Objects.requireNonNull(comboBox3.getSelectedItem()).toString();
                String combo4 = Objects.requireNonNull(comboBox4.getSelectedItem()).toString();
                String combo5 = Objects.requireNonNull(comboBox5.getSelectedItem()).toString();
                String combo6 = Objects.requireNonNull(comboBox6.getSelectedItem()).toString();
                String combo7 = Objects.requireNonNull(comboBox7.getSelectedItem()).toString();
                String combo8 = Objects.requireNonNull(comboBox8.getSelectedItem()).toString();
                String combo9 = Objects.requireNonNull(comboBox9.getSelectedItem()).toString();
                String combo10 = Objects.requireNonNull(comboBox10.getSelectedItem()).toString();
                String combo11 = Objects.requireNonNull(comboBox11.getSelectedItem()).toString();
                String combo12 = Objects.requireNonNull(comboBox12.getSelectedItem()).toString();

                // Check for duplicates
                if (Objects.equals(combo1, combo2) ||
                        Objects.equals(combo1, combo3) ||
                        Objects.equals(combo1, combo4) ||
                        Objects.equals(combo1, combo5) ||
                        Objects.equals(combo1, combo6) ||
                        Objects.equals(combo1, combo7) ||
                        Objects.equals(combo1, combo8) ||
                        Objects.equals(combo1, combo9) ||
                        Objects.equals(combo1, combo10) ||
                        Objects.equals(combo1, combo11) ||
                        Objects.equals(combo1, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo2, combo1) ||
                        Objects.equals(combo2, combo3) ||
                        Objects.equals(combo2, combo4) ||
                        Objects.equals(combo2, combo5) ||
                        Objects.equals(combo2, combo6) ||
                        Objects.equals(combo2, combo7) ||
                        Objects.equals(combo2, combo8) ||
                        Objects.equals(combo2, combo9) ||
                        Objects.equals(combo2, combo10) ||
                        Objects.equals(combo2, combo11) ||
                        Objects.equals(combo2, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo3, combo1) ||
                        Objects.equals(combo3, combo2) ||
                        Objects.equals(combo3, combo4) ||
                        Objects.equals(combo3, combo5) ||
                        Objects.equals(combo3, combo6) ||
                        Objects.equals(combo3, combo7) ||
                        Objects.equals(combo3, combo8) ||
                        Objects.equals(combo3, combo9) ||
                        Objects.equals(combo3, combo10) ||
                        Objects.equals(combo3, combo11) ||
                        Objects.equals(combo3, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo4, combo2) ||
                        Objects.equals(combo4, combo3) ||
                        Objects.equals(combo4, combo1) ||
                        Objects.equals(combo4, combo5) ||
                        Objects.equals(combo4, combo6) ||
                        Objects.equals(combo4, combo7) ||
                        Objects.equals(combo4, combo8) ||
                        Objects.equals(combo4, combo9) ||
                        Objects.equals(combo4, combo10) ||
                        Objects.equals(combo4, combo11) ||
                        Objects.equals(combo4, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo5, combo2) ||
                        Objects.equals(combo5, combo3) ||
                        Objects.equals(combo5, combo4) ||
                        Objects.equals(combo5, combo1) ||
                        Objects.equals(combo5, combo6) ||
                        Objects.equals(combo5, combo7) ||
                        Objects.equals(combo5, combo8) ||
                        Objects.equals(combo5, combo9) ||
                        Objects.equals(combo5, combo10) ||
                        Objects.equals(combo5, combo11) ||
                        Objects.equals(combo5, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo6, combo2) ||
                        Objects.equals(combo6, combo3) ||
                        Objects.equals(combo6, combo4) ||
                        Objects.equals(combo6, combo5) ||
                        Objects.equals(combo6, combo1) ||
                        Objects.equals(combo6, combo7) ||
                        Objects.equals(combo6, combo8) ||
                        Objects.equals(combo6, combo9) ||
                        Objects.equals(combo6, combo10) ||
                        Objects.equals(combo6, combo11) ||
                        Objects.equals(combo6, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo7, combo2) ||
                        Objects.equals(combo7, combo3) ||
                        Objects.equals(combo7, combo4) ||
                        Objects.equals(combo7, combo5) ||
                        Objects.equals(combo7, combo6) ||
                        Objects.equals(combo7, combo1) ||
                        Objects.equals(combo7, combo8) ||
                        Objects.equals(combo7, combo9) ||
                        Objects.equals(combo7, combo10) ||
                        Objects.equals(combo7, combo11) ||
                        Objects.equals(combo7, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo8, combo2) ||
                        Objects.equals(combo8, combo3) ||
                        Objects.equals(combo8, combo4) ||
                        Objects.equals(combo8, combo5) ||
                        Objects.equals(combo8, combo6) ||
                        Objects.equals(combo8, combo7) ||
                        Objects.equals(combo8, combo1) ||
                        Objects.equals(combo8, combo9) ||
                        Objects.equals(combo8, combo10) ||
                        Objects.equals(combo8, combo11) ||
                        Objects.equals(combo8, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo9, combo2) ||
                        Objects.equals(combo9, combo3) ||
                        Objects.equals(combo9, combo4) ||
                        Objects.equals(combo9, combo5) ||
                        Objects.equals(combo9, combo6) ||
                        Objects.equals(combo9, combo7) ||
                        Objects.equals(combo9, combo8) ||
                        Objects.equals(combo9, combo1) ||
                        Objects.equals(combo9, combo10) ||
                        Objects.equals(combo9, combo11) ||
                        Objects.equals(combo9, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo10, combo2) ||
                        Objects.equals(combo10, combo3) ||
                        Objects.equals(combo10, combo4) ||
                        Objects.equals(combo10, combo5) ||
                        Objects.equals(combo10, combo6) ||
                        Objects.equals(combo10, combo7) ||
                        Objects.equals(combo10, combo8) ||
                        Objects.equals(combo10, combo9) ||
                        Objects.equals(combo10, combo1) ||
                        Objects.equals(combo10, combo11) ||
                        Objects.equals(combo10, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo11, combo2) ||
                        Objects.equals(combo11, combo3) ||
                        Objects.equals(combo11, combo4) ||
                        Objects.equals(combo11, combo5) ||
                        Objects.equals(combo11, combo6) ||
                        Objects.equals(combo11, combo7) ||
                        Objects.equals(combo11, combo8) ||
                        Objects.equals(combo11, combo9) ||
                        Objects.equals(combo11, combo10) ||
                        Objects.equals(combo11, combo1) ||
                        Objects.equals(combo11, combo12)) {
                    error5.setText("Duplicate Selection");
                } else if (Objects.equals(combo12, combo2) ||
                        Objects.equals(combo12, combo3) ||
                        Objects.equals(combo12, combo4) ||
                        Objects.equals(combo12, combo5) ||
                        Objects.equals(combo12, combo6) ||
                        Objects.equals(combo12, combo7) ||
                        Objects.equals(combo12, combo8) ||
                        Objects.equals(combo12, combo9) ||
                        Objects.equals(combo12, combo10) ||
                        Objects.equals(combo12, combo11) ||
                        Objects.equals(combo12, combo1)) {
                    error5.setText("Duplicate Selection");
                } else{
                    error5.setText("");
                    check++;
                }

                    // Final Check
                if(check == 5){
                    successMsg.setText("Vote Complete!");

                    // Set Votes
                    for(int j = 0; j <= Candidate.count; j++){
                        // President
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(presidentBox.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        // Vice-President
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(vicepresBox.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }

                        // Senators
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox1.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox2.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox3.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox4.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox5.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox6.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox7.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox8.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox9.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox10.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox11.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                        if((Candidate.firstName[i] + " " + Candidate.lastName[i]).equals(Objects.requireNonNull(comboBox12.getSelectedItem()).toString())){
                            Candidate.votes[i]++;
                        }
                    }

                    // Reset
                    inputLastName.setText("");
                    inputFirstName.setText("");
                    presidentBox.setSelectedIndex(0);
                    vicepresBox.setSelectedIndex(0);
                    comboBox1.setSelectedIndex(0);
                    comboBox2.setSelectedIndex(0);
                    comboBox3.setSelectedIndex(0);
                    comboBox4.setSelectedIndex(0);
                    comboBox5.setSelectedIndex(0);
                    comboBox6.setSelectedIndex(0);
                    comboBox7.setSelectedIndex(0);
                    comboBox8.setSelectedIndex(0);
                    comboBox9.setSelectedIndex(0);
                    comboBox10.setSelectedIndex(0);
                    comboBox11.setSelectedIndex(0);
                    comboBox12.setSelectedIndex(0);
                    Voter.voted[i] = 1;
                }
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                electionFrame myApp = new electionFrame();
            }
        });
    }
}
