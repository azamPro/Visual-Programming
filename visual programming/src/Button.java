import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    Button(){
    label = new JLabel();
    label.setText("first window!");
    label.setBounds(100,200,200,100);
    label.setVisible(false);


    button = new JButton();
    button.setBounds(200,100,100,50);
    button.setText("click me!");
    button.addActionListener(this);
    // button.addActionListener(e -> System.out.println("clicked!"));
    button.setFocusable(false);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(null);
    this.setVisible(true);
    this.add(button);
    add(label);
   }

   public void actionPerformed(ActionEvent e){
    if(e.getSource()==button){
        this.dispose();
        Grid grid = new Grid();

    }
   }
}
