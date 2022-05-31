package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> groupModel;
    public JComboBox<String> groupCombo;

    public DefaultListModel<String> studentModel;
    public JList <String> studentList;
    JScrollPane scrollPane;



    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.groupModel = new DefaultComboBoxModel<>();
        this.groupCombo = new JComboBox<>(this.groupModel);
        this.studentModel = new DefaultListModel<>();
        this.studentList = new JList<>(this.studentModel);
        this.scrollPane  = new JScrollPane(this.studentList);
        this.scrollPane.setPreferredSize(new Dimension(200,200));//hogy ne ugráljon a mérete,legyen fix mérete
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
       
        this.mainPanel.add(this.groupCombo,BorderLayout.NORTH);
        this.mainPanel.add(this.scrollPane, BorderLayout.CENTER);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        // this.frame = new JFrame("Baráth Dávid/Ssoft 1 N/2022.05.31");
        // this.frame.setTitle("Baráth Dávid/Ssoft 1 N/2022.05.31");
        this.setLayout(new FlowLayout());
        this.setTitle("Baráth Dávid/Ssoft 1 N/2022.05.31");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}
