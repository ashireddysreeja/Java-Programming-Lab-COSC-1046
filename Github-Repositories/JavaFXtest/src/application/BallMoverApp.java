package application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallMoverApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Mover");
        BallPane ballPane = new BallPane(400, 400);

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballPane.moveLeft();
            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballPane.moveRight();
            }
        });
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballPane.moveUp();
            }
        });
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballPane.moveDown();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);

        frame.add(ballPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}

class BallPane extends JPanel {
    private int ballX = 190;
    private int ballY = 190;
    private int ballDiameter = 20;
    private int paneWidth;
    private int paneHeight;

    public BallPane(int width, int height) {
        paneWidth = width;
        paneHeight = height;
    }

    public void moveLeft() {
        if (ballX > 0) {
            ballX -= 10;
        }
        repaint();
    }

    public void moveRight() {
        if (ballX < paneWidth - ballDiameter) {
            ballX += 10;
        }
        repaint();
    }

    public void moveUp() {
        if (ballY > 0) {
            ballY -= 10;
        }
        repaint();
    }

    public void moveDown() {
        if (ballY < paneHeight - ballDiameter) {
            ballY += 10;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
    }
}