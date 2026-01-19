/**
 * The main entry point for the DailyBudgetTracker application.
 * This class demonstrates creating a transaction and saving it to a file.
 */
public class Main {
    /**
     * The main method executes the application logic.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a sample transaction
        Transaction t1 = new Transaction("Fried Chicken", 100.0, "18/01/2026", "Expense");
        
        // Initialize the file handler and save the transaction
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveTransaction(t1);

        System.out.println("Transaction saved to data.txt successfully!");
    }
}