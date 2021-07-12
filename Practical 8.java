import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseClick implements MouseListener{
Frame frame;
 MouseClick(){
frame = new Frame("Mouse Click");
frame.addMouseListener(this);
frame.setSize(200, 200);
frame.setLayout(null);
frame.setVisible(true);
}
 //Event when mouse is clicked
public void mouseClicked(MouseEvent e) {
frame.setSize(200, 200);
}
//Event when mouse enters the frame
public void mouseEntered(MouseEvent e) {
frame.setSize(600, 600);
}
//Event when mouse exits the frame
public void mouseExited(MouseEvent e) {
frame.dispose();
}
 public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public static void main(String args[]) {new MouseClick();
}
}
