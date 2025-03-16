import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convert extends JFrame implements ActionListener {
    JLabel Label1,result;
    JTextField textField;
    JPanel panel1 ,panel2;
    JButton button;

    Convert(){

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));


        Label1 = new JLabel("enter the amount in dolarrs");
        Label1.setBounds(10,50,200,30);

        textField = new JTextField(15);
        textField.setBounds(200,50,200,30);


        panel1.add(Label1);
        panel1.add(textField);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        button = new JButton("convert");
        button.setBounds(200,100,100,30);
        button.setFocusable(false);
        button.addActionListener(this);

        result = new JLabel("result = 20");
        result.setBounds(10,100,200,30);
        result.setVisible(false);
        
        panel2.add(result);
        panel2.add(button);

        add(panel1);
        add(panel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setTitle("convert currency");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(textField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter a number!", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }else if(Double.parseDouble(textField.getText()) < 0){
                JOptionPane.showMessageDialog(this, "negative number not accepted \nPlease enter a valid number!", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            } else if(Double.parseDouble(textField.getText()) == 0){
                JOptionPane.showMessageDialog(this, "0 not accepted \nPlease enter a valid number!", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String input = textField.getText();
            double amount = Double.parseDouble(input);
            double sar = amount * 3.75;

            result.setText("SAR: " + sar);
            result.setVisible(true);

        } catch (NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(this, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Convert();
    }
}
