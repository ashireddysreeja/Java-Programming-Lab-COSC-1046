package application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallMovingPane extends JPanel implements ActionListener {
    private int ballX = 50; // Initial x-coordinate of the ball
    private int ballY = 50; // Initial y-coordinate of the ball
    private int ballDiameter = 30; // Diameter of the ball
    private int paneWidth = 400; // Width of the pane
    private int paneHeight = 400; // Height of the pane

    public BallMovingPane() {
        Timer timer = new Timer(10, this); // Timer to update ball's position every 10 milliseconds
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the ball's position
        ballX += 2; // Move right
        repaint(); // Repaint the panel to show the updated position

        // Check boundaries to prevent the ball from moving out of sight
        if (ballX > paneWidth) {
            ballX = -ballDiameter; // Reset to the left when it goes out of sight
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Moving Pane");
        BallMovingPane ballMovingPane = new BallMovingPane();
        frame.add(ballMovingPane);
        frame.setSize(ballMovingPane.paneWidth, ballMovingPane.paneHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}