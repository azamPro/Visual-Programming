import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TimeConverter extends JFrame implements ActionListener{
    private JLabel l1,l2,l3,l4;
    private JButton b1,b2;
    private JTextField t1,t2,t3,t4;
    private JPanel p1,buttonPanel;
    TimeConverter(){
        setTitle("time conveter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,150);
        setLocation(800, 400);
        setLayout(new FlowLayout());

        t1 = new JTextField(10);
        
        l1 = new JLabel("seconds    =");
        
        t2 = new JTextField(8);
        t2.setEditable(false);

        l2 = new JLabel("h=");
        
        t3 = new JTextField(8);
        t3.setEditable(false);

        l3 = new JLabel("m=");
        
        t4 = new JTextField(8);
        t4.setEditable(false);

        l4 = new JLabel("s");

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        p1.add(t1);
        p1.add(l1);
        p1.add(t2);
        p1.add(l2);
        p1.add(t3);
        p1.add(l3);
        p1.add(t4);
        p1.add(l4);

        b1 = new JButton("convert");
        b1.addActionListener(this);
        b2 = new JButton("concel");

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(p1);
        add(buttonPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(t1.getText().isEmpty()){
                JOptionPane.showMessageDialog(buttonPanel, "the input is empty please enter somthing", "error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String s = t1.getText();
            double s2 = Double.parseDouble(s);

            if( 0 < s2 && s2 < 86400){
                double ho = 3600 * s2;
                double min = s2 / 60;
                
                t2.setText(String.valueOf(s2));  // Convert hours to String
                t3.setText(String.valueOf(ho)); // Convert minutes to String
                t4.setText(String.valueOf(min));  // Convert seconds to String
                
                System.out.println("ho=" + ho + "m=" + min + "seconds = " + s2);

            }else{
                JOptionPane.showMessageDialog(buttonPanel, "enter vaild number from 0 to 86400", "error", JOptionPane.ERROR_MESSAGE);
            }

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "somthing wrong", "Input Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void main(String[] args){
        new TimeConverter();
    } 
}
