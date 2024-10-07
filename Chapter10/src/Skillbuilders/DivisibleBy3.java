package Skillbuilders;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisibleBy3 extends JFrame {

    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public DivisibleBy3() {
        // Set up the JFrame
        setTitle("DivisibleBy3");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Use absolute layout for simplicity

        // Create and set up components
        JLabel promptLabel = new JLabel("Enter an integer:");
        promptLabel.setBounds(20, 20, 100, 20);
        add(promptLabel);

        inputField = new JTextField();
        inputField.setBounds(130, 20, 100, 20);
        add(inputField);

        checkButton = new JButton("Check");
        checkButton.setBounds(80, 50, 100, 30);
        add(checkButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(20, 90, 250, 20);
        add(resultLabel);

        // Add button action listener
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkDivisibility();
            }
        });
    }

    private void checkDivisibility() {
        try {
            int number = Integer.parseInt(inputField.getText());
            if (number % 3 == 0) {
                resultLabel.setText("Number is divisible by 3.");
            } else {
                resultLabel.setText("Number is not divisible by 3.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        DivisibleBy3 frame = new DivisibleBy3();
        frame.setVisible(true);
    }
}
