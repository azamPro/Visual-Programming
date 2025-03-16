import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;


public class RegistrationConfirmation extends JFrame{
    private JLabel l1,l2,l3,l4,l5;
    private JTextField t1,t2,t3;
    private JComboBox cmb1;
    private JRadioButton r1,r2;
    private JButton b1,b2;
    
    public RegistrationConfirmation(String title)
    {
        super(title);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1=new JLabel("First Name");
        t1=new JTextField(10);
        JPanel p1= new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(l1);
        p1.add(t1);
    
         
        
        l2=new JLabel("Last Name");
        t2=new JTextField(10);
        JPanel p2= new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(l2);
        p2.add(t2);
        
        l3=new JLabel("Age");
        String[] st ={"10-20","20-30","30-40","40>"};
        cmb1= new JComboBox(st);
        JPanel p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3.add(l3);
        p3.add(cmb1);
        
        l4= new JLabel("Gender");
        r1= new JRadioButton("Male");
        r2=new JRadioButton("Female");
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        JPanel p4=new JPanel(new FlowLayout(FlowLayout.LEFT));
        p4.add(l4);
        p4.add(r1);
        p4.add(r2);
        
        l5= new JLabel("E-Mail");
        t3= new JTextField(20);
        JPanel p5=new JPanel(new FlowLayout(FlowLayout.LEFT));
        p5.add(l5);
        p5.add(t3);
        
        b1= new JButton("Create");
        b2= new JButton("Cancel");
        JPanel p6= new JPanel();
        p6.add(b1);
        p6.add(b2);
        
        JPanel p=(JPanel)this.getContentPane();

        p.setLayout(new GridLayout(6,1));
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        
        this.pack();
        this.setVisible(true);
        
        b1.addActionListener(new ButtonListener());
        b2.addActionListener(new ButtonCancelListener());
    }
    
    
    

    
    public class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try{             
                boolean selected=true;
        
                if ((r1.isSelected()==false)&&(r2.isSelected()==false)) {
                    selected = false;  
                }
               if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(!selected))
                   
                   throw new Exception();              
               else                   
                        JOptionPane.showMessageDialog(null, "Registeration done Successfully");                  

            }
                catch (Exception t){
                System.out.println("Error");
                JOptionPane.showMessageDialog ( null , "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE );
                }     
            }
    }
    
    public class ButtonCancelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int n = JOptionPane.showConfirmDialog(null, "Do you want to cancel?", " ", JOptionPane.YES_NO_OPTION);
            
            if(n == 0)// if the user chooses yes
                System.exit(0);      
             
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegistrationConfirmation r = new RegistrationConfirmation("Registration page");
    }
    
}