import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainView extends JFrame {
    private JButton expenseButton;
    private JButton incomeButton;
    private JButton reportButton;
    private JButton budgetButton;

    public MainView() {
        setTitle("Expenses Tracker");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        expenseButton = new JButton("Manage Expenses");
        incomeButton = new JButton("Manage Income");
        reportButton = new JButton("Generate Report");
        budgetButton = new JButton("Set Budget");

        expenseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to open ExpenseView
            }
        });

        incomeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to open IncomeView
            }
        });

        reportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to open ReportView
            }
        });

        budgetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to open BudgetView
            }
        });

        add(expenseButton);
        add(incomeButton);
        add(reportButton);
        add(budgetButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainView mainView = new MainView();
                mainView.setVisible(true);
            }
        });
    }
}