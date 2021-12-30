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
                            break;
                        }
                        else{
                            error1.setText("");
                            check++;
                            break;
                        }
                    }
                    else{
                        error1.setText("Name not Found!");
                    }
                }

                // President
                switch(Objects.requireNonNull(presidentBox.getSelectedItem()).toString()){
                    case "- SELECT -":
                        error3.setText("Please select President");
                        break;
                    default:
                        error3.setText("");
                        check++;
                        break;
                }

                // Vice President
                switch(Objects.requireNonNull(vicepresBox.getSelectedItem()).toString()){
                    case "- SELECT -":
                        error4.setText("Please select Vice-President");
                        break;
                    default:
                        error4.setText("");
                        check++;
                        break;
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


                if(check == 4){
                    successMsg.setText("Vote Complete!");

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
