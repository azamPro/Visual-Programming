import java.awt.*;

import javax.swing.*;

public class Grid extends JFrame {
    Grid(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setTitle("Grid Layout");
        setLayout(new GridLayout(2,3));


        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        setVisible(true);
    }


}
