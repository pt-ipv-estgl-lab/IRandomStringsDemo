import java.awt.Component;
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
        content.addMouseListener(new RepaintOnClick()); // Register MouseListener 
                                                        // with the panel.
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120, 70);
        window.setSize(350, 250);
        window.setVisible(true);
        System.out.println("The End!");
    }

    /**
     * An object of type RepaintOnClick is a MouseListener that
     * will respond to a mousePressed event by calling the repaint()
     * method of the source of the event.  That is, a RepaintOnClick
     * object can be added as a mouse listener to any Component;
     * when the user clicks that component, the component will be
     * repainted.
     */
    private static class RepaintOnClick implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            Component source = (Component)e.getSource();
            source.repaint(); // Call repaint() on the Component that was clicked.
                
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
    }
}
