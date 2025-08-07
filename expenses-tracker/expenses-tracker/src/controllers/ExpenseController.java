public class ExpenseController {
    private List<Expense> expenses;
    private List<Income> incomes;
    private List<RecurringExpense> recurringExpenses;
    private Budget budget;

    public ExpenseController() {
        expenses = new ArrayList<>();
        incomes = new ArrayList<>();
        recurringExpenses = new ArrayList<>();
        budget = new Budget();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public List<Expense> generateExpenseReport() {
        return expenses;
    }

    public void addRecurringExpense(RecurringExpense recurringExpense) {
        recurringExpenses.add(recurringExpense);
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Budget getBudget() {
        return budget;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public List<RecurringExpense> getRecurringExpenses() {
        return recurringExpenses;
    }
}