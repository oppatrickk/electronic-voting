// Package
package Classes;

// Imports
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

// voterListFrame Class
public class voterListFrame extends JFrame {
    // GUI
    private JPanel voterListPanel;
    private JTable votersTable;
    private JButton returnButton;

    // Constructor
    public voterListFrame(){
        setContentPane(voterListPanel);
        setTitle("Electronic Voting System");
        setSize(720, 720);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(38, 44, 59));

        String[][] data = new String[100][5];

        for (int i = 0; i <= Voter.count; i++) {
            data[i][0] = Voter.firstName[i];
            data[i][1] = Voter.lastName[i];
            data[i][2] = Voter.year[i];
        }

        TableModel dataModel = new
                AbstractTableModel() {
                    public int getColumnCount() {
                        return 3;
                    }

                    public int getRowCount() {
                        return Voter.count;
                    }

                    public Object getValueAt(int row, int col) {
                        return data[row][col];
                    }

                    private static final String[] COLUMN_NAMES = {"First Name", "Last Name", "Year of Birth"};

                    public String getColumnName(int col) {
                        return COLUMN_NAMES[col];
                    }
                };

        // Listener
        votersTable.setModel(dataModel);
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                dispose();

                if(Election.electionPeriod){
                    electionFrame myApp = new electionFrame();
                }
                else{
                    mainFrame myApp = new mainFrame();
                }

            }
        });
    }
}
