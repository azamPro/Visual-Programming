import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 5 panel
// 4 label
// two action listnerer
public class rev extends JFrame {
    private JLabel l1,l2,l3,l4;
    private JTextField t1;
    private JButton b1,b2;
    private JComboBox cmb1;
    private JRadioButton r1,r2;
    public rev (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300,300);

        // first input
        l1 = new JLabel("first name:");
        t1 = new JTextField(10);
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(l1);
        p1.add(t1);

        l2 = new JLabel("Age:");
        String[] st = {"10-20","30-40"};
        cmb1 = new JComboBox(st);
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(l2);
        p2.add(cmb1);

        l3 = new JLabel("Gender");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Woman");
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3.add(l3);
        p3.add(r1);
        p3.add(r2);


        b1 = new JButton("Register");
        b2 = new JButton("Concel");
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p4.add(b1);
        p4.add(b2);

        JPanel p = (JPanel)this.getContentPane();
        p.setLayout(new GridLayout(4,1));
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);


        this.pack();
        this.setVisible(true);
        b1.addActionListener(new Register());
        b2.addActionListener(new Concel());
    }

    public class Register implements ActionListener{

        public void actionPerformed(ActionEvent e){
            try{
                boolean selected = true;
                if(r1.isSelected()==false && r2.isSelected()== false){
                    selected=false;
                }
                if(t1.getText().equals("") || (!selected)){
                    throw new Exception();
                }else 
                    JOptionPane.showMessageDialog(null,"register done");

            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, "please fill the imput","error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public class Concel implements ActionListener{

        public void actionPerformed(ActionEvent e){
               
                int n = JOptionPane.showConfirmDialog(null, "are you sure?", "concer",JOptionPane.YES_NO_OPTION);
                if(n == 0)
                System.exit(0);
        }
    }

    public static void main (String[] args){
        rev start = new rev("first program");
    }
}
