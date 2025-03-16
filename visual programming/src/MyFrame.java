import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
    MyFrame() {
        Border border = BorderFactory.createLineBorder(Color.cyan, 3);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("azzam code guys!");
        // this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);

        JLabel label = new JLabel();
        label.setText("did you understod the code?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        this.add(label);
    }
}