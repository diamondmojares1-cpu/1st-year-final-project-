import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncomeView extends JFrame {
    private JTextField amountField;
    private JTextField sourceField;
    private JTextField dateField;
    private JButton addButton;
    private JTextArea incomeListArea;

    public IncomeView() {
        setTitle("Income Tracker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        amountField = new JTextField(10);
        sourceField = new JTextField(10);
        dateField = new JTextField(10);
        addButton = new JButton("Add Income");
        incomeListArea = new JTextArea(10, 30);
        incomeListArea.setEditable(false);

        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel("Source:"));
        add(sourceField);
        add(new JLabel("Date:"));
        add(dateField);
        add(addButton);
        add(new JScrollPane(incomeListArea));

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addIncome();
            }
        });
    }

    private void addIncome() {
        String amount = amountField.getText();
        String source = sourceField.getText();
        String date = dateField.getText();

        if (!amount.isEmpty() && !source.isEmpty() && !date.isEmpty()) {
            incomeListArea.append("Income: " + amount + " from " + source + " on " + date + "\n");
            amountField.setText("");
            sourceField.setText("");
            dateField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IncomeView incomeView = new IncomeView();
            incomeView.setVisible(true);
        });
    }
}