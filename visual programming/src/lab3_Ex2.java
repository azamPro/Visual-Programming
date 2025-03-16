import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab3_Ex2 extends JFrame{
    private JLabel l1,l2;
    private JTextField t1,t2;
    private JComboBox<String> cmb1, cmb2; // ✅ Specify type parameter <String>
    private JButton b1,b2;
    private String cur[] ={"SAR","DOLLAR"} ;
    public lab3_Ex2 (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,400);
        this.setLayout(new GridLayout(2,1));

        t1 = new JTextField(10);
        cmb1 = new JComboBox<String>(cur); 
        l1 = new JLabel("rate = ");
        l2 = new JLabel();
        l2.setForeground(Color.red);
        t2 = new JTextField(10);
        cmb2 = new JComboBox<String>(cur); 

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(t1);
        p1.add(cmb1);
        p1.add(l1);
        p1.add(l2);
        p1.add(t2);
        p1.add(cmb2);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        b1= new JButton("Convert");
        b2= new JButton("Cancel");
        p2.add(b1);
        p2.add(b2);



        JPanel p = (JPanel)this.getContentPane();

        p.add(p1);
        p.add(p2);

        this.pack();
        this.setVisible(true);

        b1.addActionListener(new Convert());
        b2.addActionListener(new Concel());
    }

    public class Convert implements ActionListener{

        public void actionPerformed(ActionEvent a){
            System.out.println("hi conv");
            try{
                if(t1.getText().equals("") || cmb1.getSelectedItem() == cmb2.getSelectedItem() ){
                    JOptionPane.showMessageDialog(null, "error valid currency or empty ","error", JOptionPane.ERROR_MESSAGE);
                }
                double number = Double.parseDouble(t1.getText());
                if (number < 0) {
                    JOptionPane.showMessageDialog(null, "negtive not accepted ","warning", JOptionPane.WARNING_MESSAGE);

                }
            }catch(Exception e){

            }
        }
    }
    public class Concel implements ActionListener{

        public void actionPerformed(ActionEvent a){
            System.out.println("hi concel");
        }
    }

    public static void main(String[] args){
        lab3_Ex2 la = new lab3_Ex2("first program");
    }
}
