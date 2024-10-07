package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class LocalBankGUI extends JFrame {
    // GUI components
    private JComboBox<String> actionComboBox;
    private JTextField accountNumberField, amountField, firstNameField, lastNameField, balanceField;
    private JLabel resultLabel;
    private JButton processButton;

    // Data structure to store account information (account number as key, balance as value)
    private HashMap<String, Double> accounts;

    public LocalBankGUI() {
        // Initialize the accounts HashMap
        accounts = new HashMap<>();

        // Set up the frame
        setTitle("LocalBankGUI");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 10, 10)); // 8 rows, 2 columns

        // Action selection dropdown
        String[] actions = {"Deposit", "Withdrawal", "Check Balance", "Add Account", "Remove Account"};
        actionComboBox = new JComboBox<>(actions);
        add(new JLabel("Select an action:"));
        add(actionComboBox);

        // Account number (in red)
        JLabel accountLabel = new JLabel("Account number:");
        accountLabel.setForeground(Color.RED);
        add(accountLabel);
        accountNumberField = new JTextField();
        add(accountNumberField);

        // Amount (in red) for deposit/withdrawal (optional for other actions)
        JLabel amountLabel = new JLabel("Amount of deposit/withdrawal:");
        amountLabel.setForeground(Color.RED);
        add(amountLabel);
        amountField = new JTextField();
        add(amountField);

        // First name field (used for adding accounts)
        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        // Last name field (used for adding accounts)
        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        // Beginning balance field (Editable now for "Add Account" action)
        add(new JLabel("Beginning Balance:"));
        balanceField = new JTextField();
        add(balanceField);

        // Result label to display account info
        resultLabel = new JLabel("Account Info Displayed Here");
        add(resultLabel);

        // Process transaction button
        processButton = new JButton("Process Transaction");
        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processTransaction();
            }
        });
        add(processButton);

        setVisible(true);
    }

    private void processTransaction() {
        // Get inputs
        String action = (String) actionComboBox.getSelectedItem();
        String accountNumber = accountNumberField.getText();
        String amountText = amountField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String initialBalanceText = balanceField.getText();

        // Validate inputs for actions that need account number
        if (accountNumber.isEmpty() && !action.equals("Add Account")) {
            JOptionPane.showMessageDialog(this, "Please enter an Account Number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform actions based on user selection
        switch (action) {
            case "Deposit":
                if (!accounts.containsKey(accountNumber)) {
                    JOptionPane.showMessageDialog(this, "Account does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double depositAmount = getAmount(amountText);
                if (depositAmount == -1) return; // Validation failed
                accounts.put(accountNumber, accounts.get(accountNumber) + depositAmount);
                resultLabel.setText("Deposited $" + depositAmount + " into account: " + accountNumber);
                break;

            case "Withdrawal":
                if (!accounts.containsKey(accountNumber)) {
                    JOptionPane.showMessageDialog(this, "Account does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double withdrawalAmount = getAmount(amountText);
                if (withdrawalAmount == -1) return; // Validation failed
                if (accounts.get(accountNumber) < withdrawalAmount) {
                    JOptionPane.showMessageDialog(this, "Insufficient balance!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                accounts.put(accountNumber, accounts.get(accountNumber) - withdrawalAmount);
                resultLabel.setText("Withdrew $" + withdrawalAmount + " from account: " + accountNumber);
                break;

            case "Check Balance":
                if (!accounts.containsKey(accountNumber)) {
                    JOptionPane.showMessageDialog(this, "Account does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double currentBalance = accounts.get(accountNumber);
                resultLabel.setText("Account Balance for " + accountNumber + ": $" + currentBalance);
                break;

            case "Add Account":
                if (accounts.containsKey(accountNumber)) {
                    JOptionPane.showMessageDialog(this, "Account already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (firstName.isEmpty() || lastName.isEmpty() || initialBalanceText.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please fill in all fields to add an account.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double beginningBalance = getAmount(initialBalanceText);
                if (beginningBalance == -1) return; // Validation failed
                accounts.put(accountNumber, beginningBalance);
                resultLabel.setText("Account " + accountNumber + " added with balance: $" + beginningBalance);
                break;

            case "Remove Account":
                if (!accounts.containsKey(accountNumber)) {
                    JOptionPane.showMessageDialog(this, "Account does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                accounts.remove(accountNumber);
                resultLabel.setText("Account " + accountNumber + " has been removed.");
                break;

            default:
                resultLabel.setText("Unknown action selected.");
        }
    }

    // Method to validate and parse amount fields
    private double getAmount(String amountText) {
        try {
            return Double.parseDouble(amountText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid amount. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static void main(String[] args) {
        new LocalBankGUI();
    }
}

