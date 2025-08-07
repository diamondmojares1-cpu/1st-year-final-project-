import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

public class ReportView extends JFrame {
    private JTextArea reportArea;
    private JButton generateReportButton;
    private JComboBox<String> reportTypeComboBox;

    public ReportView() {
        setTitle("Expense Report");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        reportArea = new JTextArea();
        reportArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(reportArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        reportTypeComboBox = new JComboBox<>(new String[]{"Monthly", "Yearly", "Custom"});
        generateReportButton = new JButton("Generate Report");

        panel.add(reportTypeComboBox);
        panel.add(generateReportButton);
        add(panel, BorderLayout.SOUTH);

        generateReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateReport();
            }
        });
    }

    private void generateReport() {
        String reportType = (String) reportTypeComboBox.getSelectedItem();
        // Logic to generate report based on the selected type
        // This is a placeholder for the actual report generation logic
        reportArea.setText("Generating " + reportType + " report...\n");
        // Here you would typically fetch data from the model and format it for display
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReportView reportView = new ReportView();
            reportView.setVisible(true);
        });
    }
}