import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public Main(){

        JLabel label = new JLabel();
        label.setText("did you understod the code?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        JPanel redPan = new JPanel();
        redPan.setBackground(Color.red);
        redPan.setBounds(0,0,300,300);
        // redPan.setLayout(new BorderLayout());

        JPanel bluePan = new JPanel();
        bluePan.setBackground(Color.blue);
        bluePan.setBounds(300,0,300,300);

        // Container c = getContentPane();

        JPanel greenPan = new JPanel();
        greenPan.setBackground(Color.green);
        greenPan.setBounds(0,300,600,300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750,750);
        setVisible(true);
        setLayout(null);
        setTitle("First GUI");
        greenPan.add(label);
        add(greenPan);
        add(bluePan);
        add(redPan);
    }
        
    public static void main(String[] args) {

        // MyFrame myFrame = new MyFrame();
        // newWind newWind = new newWind();
        

        // Main window = new Main();

        // this for buttons
        // new Button();

        // this for border
        // new Border();

        // this for flow layout
        // new CustomFlowLayout();

        // this for grid layout
        // new Grid();

        // for diolague
        new Diolague();
    }
}
