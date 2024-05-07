import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
/**
 * Use a subclass of JPanel (RandomStringsPanel) as a drawing surface.
 * In this new version, the panel will repaint itself when the user clicks on it.
 */

public class App {
    public static void main(String[] args) {
        JFrame window = new JFrame("Java!");
        RandomStringsPanel content = new RandomStringsPanel();
        content.addMouseListener(new MouseAdapter() {
            // Register a mouse listener that is defined by an anonymous subclass
            // of MouseAdapter. This replaces the RepaintOnClick iner class that was
            // used in the original version.
            public void mousePressed(MouseEvent e) {
                Component source = (Component) e.getSource();
                source.repaint();
            }
        });  
                                                        // with the panel.
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120, 70);
        window.setSize(350, 250);
        window.setVisible(true);
        System.out.println("The End!");
    }

}
