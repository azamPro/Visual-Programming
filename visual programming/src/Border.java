import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border extends JFrame {
    Border(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(new BorderLayout(10,2));
        this.setTitle("Border Layout");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.orange);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.WEST);
        add(panel3, BorderLayout.CENTER);
        add(panel4, BorderLayout.EAST);
        add(panel5, BorderLayout.SOUTH);

    }
}
