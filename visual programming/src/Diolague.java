import javax.swing.*;

public class Diolague extends JFrame {
    Diolague(){
        // JOptionPane.showMessageDialog(null, "hello there anyone here?", "notic!", JOptionPane.PLAIN_MESSAGE);;
        // JOptionPane.showMessageDialog(null, "hello there anyone here?", "notic!", JOptionPane.INFORMATION_MESSAGE);;
        // JOptionPane.showMessageDialog(null, "hello there anyone here?", "notic!", JOptionPane.QUESTION_MESSAGE);;
        // JOptionPane.showMessageDialog(null, "hello there anyone here?", "notic!", JOptionPane.WARNING_MESSAGE);;    
        // JOptionPane.showMessageDialog(null, "hello there anyone here?", "notic!", JOptionPane.ERROR_MESSAGE);;

        JOptionPane.showConfirmDialog(null, "helloooo", "say okay", JOptionPane.YES_NO_CANCEL_OPTION);

        String name = JOptionPane.showInputDialog("what is your name?");
        System.out.println("your name is: "+name);
    }
    public static void main(String[] args) {
        new Diolague();
    }
}
