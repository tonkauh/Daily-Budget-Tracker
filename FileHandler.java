import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Handles file operations for the DailyBudgetTracker application.
 * This class is responsible for saving transaction data to a text file.
 */
public class FileHandler {
    private String fileName = "data.txt";

    /**
     * Appends a transaction to the data file.
     * 
     * @param t The transaction object to be saved.
     */
    public void saveTransaction(Transaction t) {
        // Use try-with-resources to ensure the writer is closed automatically.
        // The 'true' argument in FileWriter enables append mode (adding to the end of the file).
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(t.toString());
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }
}