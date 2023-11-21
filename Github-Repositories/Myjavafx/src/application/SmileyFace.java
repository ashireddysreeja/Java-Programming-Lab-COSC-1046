package application;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
 
public class SmileyFace extends JPanel {
   @Override
   protected void paintComponent(Graphics g) {
       super.paintComponent(g);
       Graphics2D g2d = (Graphics2D) g;
       int centerX = getWidth() / 2;
       int centerY = getHeight() / 2;
       int radius = 100;
       Ellipse2D head = new Ellipse2D.Double(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
       g2d.setColor(Color.YELLOW);
       g2d.fill(head);
       g2d.setColor(Color.BLACK);
       g2d.draw(head);
       int eyeRadius = 15;
       int eyeSpacing = 30;
       int eyeY = centerY - 30;
       Ellipse2D leftEye = new Ellipse2D.Double(centerX - eyeSpacing - eyeRadius, eyeY, 2 * eyeRadius, 2 * eyeRadius);
       Ellipse2D rightEye = new Ellipse2D.Double(centerX + eyeSpacing - eyeRadius, eyeY, 2 * eyeRadius, 2 * eyeRadius);
       g2d.setColor(Color.BLACK);
       g2d.fill(leftEye);
       g2d.fill(rightEye);
       int smileWidth = 60;
       int smileHeight = 40;
       int smileStartX = centerX - smileWidth / 2;
       int smileStartY = centerY + 20;
       Arc2D.Double smile = new Arc2D.Double(smileStartX, smileStartY, smileWidth, smileHeight, 0, 180, Arc2D.OPEN);
       g2d.setColor(Color.BLACK);
       g2d.draw(smile);
   }
 
   public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
           JFrame frame = new JFrame("Smiley Face");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(new SmileyFace());
           frame.setSize(300, 300);
           frame.setVisible(true);
       });
   }
}