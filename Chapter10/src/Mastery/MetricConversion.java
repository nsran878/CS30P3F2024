package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MetricConversion extends JFrame {
    // ComboBox for selecting conversion type
    private JComboBox<String> conversionType;
    // Label for displaying the result
    private JLabel resultLabel;

    public MetricConversion() {
        // Set up the frame
        setTitle("MetricConversion");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the conversion types in the ComboBox
        String[] conversions = {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"};
        conversionType = new JComboBox<>(conversions);

        // Set up the result label
        resultLabel = new JLabel("Select a conversion type");

        // Add action listener to ComboBox to display conversion formula
        conversionType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedConversion = (String) conversionType.getSelectedItem();
                updateResultLabel(selectedConversion);
            }
        });

        // Layout for the components
        setLayout(new FlowLayout());
        add(new JLabel("Select a conversion type:"));
        add(conversionType);
        add(resultLabel);

        // Set frame visibility
        setVisible(true);
    }

    // Method to update the result label based on selected conversion
    private void updateResultLabel(String conversion) {
        switch (conversion) {
            case "Inches to Centimeters":
                resultLabel.setText("1 inch = 2.54 centimeters");
                break;
            case "Feet to Meters":
                resultLabel.setText("1 foot = 0.3048 meters");
                break;
            case "Gallons to Liters":
                resultLabel.setText("1 gallon = 4.5461 liters");
                break;
            case "Pounds to Kilograms":
                resultLabel.setText("1 pound = 0.4536 kilograms");
                break;
            default:
                resultLabel.setText("Select a conversion type");
        }
    }

    public static void main(String[] args) {
        // Create and run the MetricConversion GUI
        new MetricConversion();
    }
}

