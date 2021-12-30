// Package
package Classes;

// Imports
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class candidateFrame extends JFrame {
    // GUI
    private JPanel candidatePanel;
    private JTabbedPane candidateTab;
    private JTable presidentTable;
    private JButton returnButton;
    private JTable vicepresTable;
    private JTable senatorTable;

    // Variables

    // Constructor
    public candidateFrame() {
        setContentPane(candidatePanel);
        setTitle("Electronic Voting System");
        setSize(1024, 720);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(38, 44, 59));

        String[][] data_president = new String[100][100];
        String[][] data_vicepres = new String[100][100];
        String[][] data_senator = new String[100][100];
        int j = 0;
        int k = 0;
        int l = 0;

        for (int i = 0; i <= Candidate.count; i++) {
            if (Objects.equals(Candidate.position[i], "President")) {
                data_president[j][0] = Candidate.firstName[i];
                data_president[j][1] = Candidate.lastName[i];
                data_president[j][2] = Candidate.politicalParty[i];
                data_president[j][3] = Candidate.educationalBackground[i];
                data_president[j][4] = Candidate.qualified[i];
                data_president[j][5] = Candidate.criminalCase[i];
                j++;
            }
            else if (Objects.equals(Candidate.position[i], "Vice-President")) {
                data_vicepres[k][0] = Candidate.firstName[i];
                data_vicepres[k][1] = Candidate.lastName[i];
                data_vicepres[k][2] = Candidate.politicalParty[i];
                data_vicepres[k][3] = Candidate.educationalBackground[i];
                data_vicepres[k][4] = Candidate.qualified[i];
                data_vicepres[k][5] = Candidate.criminalCase[i];
                k++;
            }
            else if (Objects.equals(Candidate.position[i], "Senator")) {
                data_senator[l][0] = Candidate.firstName[i];
                data_senator[l][1] = Candidate.lastName[i];
                data_senator[l][2] = Candidate.politicalParty[i];
                data_senator[l][3] = Candidate.educationalBackground[i];
                data_senator[l][4] = Candidate.qualified[i];
                data_senator[l][5] = Candidate.criminalCase[i];
                l++;
            }
        }

            TableModel dataModel_1 = new
                    AbstractTableModel() {
                        public int getColumnCount() {
                            return 6;
                        }

                        public int getRowCount() {
                            return Candidate.presidentCount;
                        }

                        public Object getValueAt(int row, int col) {
                            return data_president[row][col];
                        }

                        private static final String[] COLUMN_NAMES = {"First Name", "Last Name", "Political Party", "Education", "Qualified", "Criminal Record"};

                        public String getColumnName(int col) {
                            return COLUMN_NAMES[col];
                        }
                    };

            TableModel dataModel_2 = new
                    AbstractTableModel() {
                        public int getColumnCount() {
                            return 6;
                        }

                        public int getRowCount() {
                            return Candidate.vicepresCount;
                        }

                        public Object getValueAt(int row, int col) {
                            return data_vicepres[row][col];
                        }

                        private static final String[] COLUMN_NAMES = {"First Name", "Last Name", "Political Party", "Education", "Qualified", "Criminal Record"};

                        public String getColumnName(int col) {
                            return COLUMN_NAMES[col];
                        }
                    };

            TableModel dataModel_3 = new
                    AbstractTableModel() {
                        public int getColumnCount() {
                            return 6;
                        }

                        public int getRowCount() {
                            return Candidate.senatorCount;
                        }

                        public Object getValueAt(int row, int col) {
                            return data_senator[row][col];
                        }

                        private static final String[] COLUMN_NAMES = {"First Name", "Last Name", "Political Party", "Education", "Qualified", "Criminal Record"};

                        public String getColumnName(int col) {
                            return COLUMN_NAMES[col];
                        }
                    };

            presidentTable.setModel(dataModel_1);
            vicepresTable.setModel(dataModel_2);
            senatorTable.setModel(dataModel_3);

            // Listener
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
