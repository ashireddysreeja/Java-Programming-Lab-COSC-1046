package application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallMover {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Mover");
        BallPane ballPane = new BallPane(400, 400);

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        leftButton.addActionListener(e -> ballPane.moveLeft());
        rightButton.addActionListener(e -> ballPane.moveRight());
        upButton.addActionListener(e -> ballPane.moveUp());
        downButton.addActionListener(e -> ballPane.moveDown());

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