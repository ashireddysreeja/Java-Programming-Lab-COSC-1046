package application;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton clearButton = new JButton("Clear");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double result = num1 + num2;
                    resultField.setText(Double.toString(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double result = num1 - num2;
                    resultField.setText(Double.toString(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                resultField.setText("");
            }
        });

        panel.add(textField1);
        panel.add(textField2);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(resultField);
        panel.add(clearButton);

        frame.setVisible(true);
    }
}