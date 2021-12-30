// Packages
package Classes;

// Imports
import javax.swing.*;

// errorFrame Class
public class errorFrame extends JFrame{

    // GUI
    private JPanel errorPanel;
    private JButton closeButton;

    // Constructor
    public errorFrame(){
        setContentPane(errorPanel);
        setTitle("Electronic Voting System");
        setSize(720, 480);
        setVisible(true);
        //getContentPane().setBackground(new java.awt.Color(38,44,59));
        setLocationRelativeTo(null);


    }


}
