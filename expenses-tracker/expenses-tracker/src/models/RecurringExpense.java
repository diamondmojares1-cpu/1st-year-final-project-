public class RecurringExpense {
    private double amount;
    private String frequency; // e.g., "monthly", "weekly", etc.
    private String nextDueDate;

    public RecurringExpense(double amount, String frequency, String nextDueDate) {
        this.amount = amount;
        this.frequency = frequency;
        this.nextDueDate = nextDueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(String nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    @Override
    public String toString() {
        return "RecurringExpense{" +
                "amount=" + amount +
                ", frequency='" + frequency + '\'' +
                ", nextDueDate='" + nextDueDate + '\'' +
                '}';
    }
}