# Expenses Tracker

This is a simple Java application for tracking expenses and income, generating reports, and managing budgets. The application utilizes Java AWT for the graphical user interface.

## Features

- **Expense Tracking**: Add and manage individual expenses with details such as amount, category, date, and description.
- **Income Tracking**: Record and manage income entries with details such as amount, source, and date.
- **Expenses Reporting**: Generate reports to analyze spending over time.
- **Recurring Expenses**: Manage expenses that occur on a regular basis, including setting the frequency and next due date.
- **Salary Input**: Input salary information to help track income against expenses.
- **Expenses Budget Limits**: Set budget limits for different categories of expenses to help manage finances effectively.

## Project Structure

```
expenses-tracker
├── src
│   ├── App.java
│   ├── controllers
│   │   └── ExpenseController.java
│   ├── models
│   │   ├── Expense.java
│   │   ├── Income.java
│   │   ├── RecurringExpense.java
│   │   └── Budget.java
│   ├── views
│   │   ├── MainView.java
│   │   ├── ExpenseView.java
│   │   ├── IncomeView.java
│   │   ├── ReportView.java
│   │   └── BudgetView.java
├── lib
│   └── awt.jar
├── .gitignore
└── README.md
```

## Setup Instructions

1. Clone the repository to your local machine.
2. Ensure you have Java Development Kit (JDK) installed.
3. Navigate to the project directory.
4. Compile the Java files using the command:
   ```
   javac -cp "lib/awt.jar" src/*.java src/controllers/*.java src/models/*.java src/views/*.java
   ```
5. Run the application using the command:
   ```
   java -cp "lib/awt.jar:src" App
   ```

## Usage Guidelines

- Launch the application to access the main interface.
- Use the navigation options to add expenses, income, set budgets, and generate reports.
- Follow the prompts in each view to enter the necessary information.

## Contributing

Feel free to submit issues or pull requests for improvements or bug fixes.