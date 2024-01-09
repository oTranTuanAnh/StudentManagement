package views;

import javax.swing.*;

public class MainViews extends JFrame{
    private JPanel mainPanel;
    private JLabel studentID;
    private JTextField textField1;
    private JButton buttonSearch;
    private JLabel studentIDInput;
    private JTextField textField2;
    private JLabel studentList;
    private JTable tableStudent;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public MainViews(){
        setContentPane(mainPanel);
        setTitle("Student Manager");
        setSize(800,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainViews m = new MainViews();
    }


}
