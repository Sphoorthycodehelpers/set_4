import java.awt.*;
import java.awt.event.*;

class Mouse extends Frame {
    String s = "Do something inside window with mouse";

    Mouse() {
        setName("Mouse");
        setSize(600, 400);
        setVisible(true);
        setTitle("MOUSE EVENTS");

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                s = "mouseClicked";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                s = "mouseEntered";
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                s = "MouseExited";
                repaint();
            }

            public void mousePressed(MouseEvent e) {
                s = "mousePressed";
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                s = "mouse released";
                repaint();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                s = "mouseDragged";
                repaint();
            }

            public void mouseMoved(MouseEvent e) {
                s = "mouseMoved";
                repaint();
            }
        });

        addWindowListener(new Window());
    }

    public void paint(Graphics g) {
        g.drawString(s, 300, 200);
    }

    public static void main(String ar[]) {
        new Mouse();
    }
}

class Window extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
