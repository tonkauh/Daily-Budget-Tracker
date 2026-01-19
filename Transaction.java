/**
 * Represents a financial transaction (income or expense).
 * Stores details such as description, amount, date, and type.
 */
public class Transaction {
    private String description;
    private double amount;
    private String date;
    private String type; // "Income" or "Expense"

    /**
     * Constructs a new Transaction with the specified details.
     * 
     * @param description A brief description of the transaction.
     * @param amount      The monetary value of the transaction.
     * @param date        The date of the transaction (e.g., "DD/MM/YYYY").
     * @param type        The type of transaction ("Income" or "Expense").
     */
    public Transaction(String description, double amount, String date, String type){
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    /**
     * Gets the description of the transaction.
     * @return The description.
     */
    public String getDescription(){
        return description;
    }

    /**
     * Gets the amount of the transaction.
     * @return The amount.
     */
    public double getAmount(){
        return amount;
    }

    /**
     * Gets the date of the transaction.
     * @return The date string.
     */
    public String getDate(){
        return date;
    }

    /**
     * Gets the type of the transaction.
     * @return The type (e.g., "Income", "Expense").
     */
    public String getType(){
        return type;
    }

    /**
     * Sets the description of the transaction.
     * @param description The new description.
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Returns a string representation of the transaction.
     * Useful for printing the transaction details in a readable format.
     */
    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f THB (%s)", type, description, amount, date);
    }
}
