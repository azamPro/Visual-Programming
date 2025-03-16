import java.awt.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class CustomFlowLayout extends JFrame {
    CustomFlowLayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setTitle("Flow Layout");
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());



        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomFlowLayout();
    }
}
