import javax.swing.JFrame;
/**
 * Use a subclass of JPanel (RandomStringsPanel) as a drawing surface.
 */

public class App {
    public static void main(String[] args) {
        JFrame window = new JFrame("Java!");
        RandomStringsPanel content = new RandomStringsPanel();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120, 70);
        window.setSize(350, 250);
        window.setVisible(true);
        System.out.println("The End!");
    }
}
