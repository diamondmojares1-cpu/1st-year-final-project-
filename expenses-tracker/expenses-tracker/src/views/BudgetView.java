import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BudgetView extends JFrame {
    private JTextField categoryField;
    private JTextField limitField;
    private JTextArea budgetDisplayArea;
    private JButton addButton;
    private JButton viewButton;

    public BudgetView() {
        setTitle("Budget Tracker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        categoryField = new JTextField(15);
        limitField = new JTextField(15);
        budgetDisplayArea = new JTextArea(10, 30);
        budgetDisplayArea.setEditable(false);
        addButton = new JButton("Add Budget");
        viewButton = new JButton("View Budgets");

        add(new JLabel("Category:"));
        add(categoryField);
        add(new JLabel("Limit:"));
        add(limitField);
        add(addButton);
        add(viewButton);
        add(new JScrollPane(budgetDisplayArea));

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBudget();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewBudgets();
            }
        });
    }

    private void addBudget() {
        String category = categoryField.getText();
        String limit = limitField.getText();
        if (!category.isEmpty() && !limit.isEmpty()) {
            budgetDisplayArea.append("Category: " + category + ", Limit: " + limit + "\n");
            categoryField.setText("");
            limitField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both category and limit.");
        }
    }

    private void viewBudgets() {
        // Logic to view budgets can be implemented here
        JOptionPane.showMessageDialog(this, "Viewing budgets is not yet implemented.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BudgetView budgetView = new BudgetView();
            budgetView.setVisible(true);
        });
    }
}