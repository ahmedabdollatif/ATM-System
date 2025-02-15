import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    // The initial balance
    private int balance = 5000;

    // Components for the GUI
    private JTextArea displayArea;
    private JTextField amountField;

    public Main() {
        setTitle("ATM Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 350);
        setLocationRelativeTo(null); // Centers the window

        // Create a display area for showing messages and balance information
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Create an input field for entering amounts
        amountField = new JTextField(10);

        // Create buttons for the different operations
        JButton btnWithdraw = new JButton("Withdraw");
        JButton btnDeposit = new JButton("Deposit");
        JButton btnCheckBalance = new JButton("Check Balance");
        JButton btnExit = new JButton("Exit");

        // Panel for amount input
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);

        // Panel for the operation buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnWithdraw);
        buttonPanel.add(btnDeposit);
        buttonPanel.add(btnCheckBalance);
        buttonPanel.add(btnExit);

        // Setting up the layout of the frame
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        // Initialize the display area with a welcome message and the current balance
        displayArea.setText("Welcome to the ATM Application!\n");
        displayArea.append("Your current balance is: " + balance + "\n\n");

        // Action listener for the Withdraw button
        btnWithdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performWithdrawal();
            }
        });

        // Action listener for the Deposit button
        btnDeposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performDeposit();
            }
        });

        // Action listener for the Check Balance button
        btnCheckBalance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayArea.append("Your current balance is: " + balance + "\n\n");
            }
        });

        // Action listener for the Exit button
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "Thanks for using the ATM application, 3blatif!");
                System.exit(0);
            }
        });
    }

    // Method to perform the withdrawal operation
    private void performWithdrawal() {
        try {
            int amount = Integer.parseInt(amountField.getText().trim());
            if (amount < 1) {
                JOptionPane.showMessageDialog(this, "Please enter an amount greater than 0!",
                        "Invalid Amount", JOptionPane.ERROR_MESSAGE);
            } else if (amount > balance) {
                JOptionPane.showMessageDialog(this, "Insufficient balance. Maximum withdrawable amount is: " + balance,
                        "Insufficient Funds", JOptionPane.ERROR_MESSAGE);
            } else {
                balance -= amount;
                displayArea.append("Withdrawal successful. You withdrew: " + amount + "\n");
                displayArea.append("New balance: " + balance + "\n\n");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid integer amount.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        amountField.setText("");
    }

    // Method to perform the deposit operation
    private void performDeposit() {
        try {
            int amount = Integer.parseInt(amountField.getText().trim());
            if (amount < 1) {
                JOptionPane.showMessageDialog(this, "Please enter an amount greater than 0!",
                        "Invalid Amount", JOptionPane.ERROR_MESSAGE);
            } else {
                balance += amount;
                displayArea.append("Deposit successful. You deposited: " + amount + "\n");
                displayArea.append("New balance: " + balance + "\n\n");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid integer amount.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        amountField.setText("");
    }

    public static void main(String[] args) {
        // Launch the ATM GUI in the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
