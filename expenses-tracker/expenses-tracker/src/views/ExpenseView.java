import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExpenseView extends JFrame {
    private JTextField amountField;
    private JTextField categoryField;
    private JTextField dateField;
    private JTextArea descriptionArea;
    private JButton addButton;
    private JButton viewButton;

    public ExpenseView() {
        setTitle("Expense Tracker - Add Expense");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        amountField = new JTextField(10);
        categoryField = new JTextField(10);
        dateField = new JTextField(10);
        descriptionArea = new JTextArea(5, 20);
        addButton = new JButton("Add Expense");
        viewButton = new JButton("View Expenses");

        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel("Category:"));
        add(categoryField);
        add(new JLabel("Date (YYYY-MM-DD):"));
        add(dateField);
        add(new JLabel("Description:"));
        add(new JScrollPane(descriptionArea));
        add(addButton);
        add(viewButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addExpense();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewExpenses();
            }
        });
    }

    private void addExpense() {
        // Logic to add expense
        String amount = amountField.getText();
        String category = categoryField.getText();
        String date = dateField.getText();
        String description = descriptionArea.getText();
        
        // Here you would typically call a method from ExpenseController to handle the logic
        System.out.println("Expense Added: " + amount + ", " + category + ", " + date + ", " + description);
    }

    private void viewExpenses() {
        // Logic to view expenses
        // This would typically open a new window or dialog to display expenses
        System.out.println("Viewing Expenses...");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ExpenseView().setVisible(true);
            }
        });
    }
}