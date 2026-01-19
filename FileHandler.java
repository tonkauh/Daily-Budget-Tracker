import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {
    private String fileName = "data.txt";

    // Method สำหรับบันทึกรายการลงไฟล์
    public void saveTransaction(Transaction t) {
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(t.toString()); // บันทึกรูปแบบเดียวกับที่แสดงในจอ
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }
}