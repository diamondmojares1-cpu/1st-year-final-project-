public class Budget {
    private String category;
    private double limitAmount;

    public Budget(String category, double limitAmount) {
        this.category = category;
        this.limitAmount = limitAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(double limitAmount) {
        this.limitAmount = limitAmount;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "category='" + category + '\'' +
                ", limitAmount=" + limitAmount +
                '}';
    }
}