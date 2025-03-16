import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rev2 extends JFrame {
    private JLabel l1,l2,l3,l4,l5;
    private JTextField t1,t2,t3;
    private JComboBox cmb1;
    private JRadioButton r1,r2;
    private JButton b1,b2;

    public rev2(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocation(400,300);
        this.setLayout(new GridLayout(6,1));

        l1 = new JLabel("First name");
        t1 = new JTextField(10);
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(l1);
        p1.add(t1);

        l2 = new JLabel("Last name");
        t2 = new JTextField(10);
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(l2);
        p2.add(t2);

        l3 = new JLabel("Age");
        String[] st = {"10-20","20-30","30-40","40>"};
        cmb1 = new JComboBox<String>(st);
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3.add(l3);
        p3.add(cmb1);

        l4 = new JLabel("gender");
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("famle");
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p4.add(l4);
        p4.add(r1);
        p4.add(r2);


        b1 = new JButton("Register");
        b2 = new JButton("Concel");
        JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        b1.addActionListener(new ButtonRegister());
        b1.addActionListener(new ButtonCancelListener());
        p6.add(b1);
        p6.add(b2);




        JPanel p = (JPanel)this.getContentPane();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p6);

        this.pack();
        this.setVisible(true);



    }

    public class ButtonRegister implements ActionListener {
        public void actionPerformed(ActionEvent a) {

        }
    }

    public class ButtonCancelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }
    }

    public static void main(String[] args){
        rev2 r = new rev2("my first pro");
    }

}
