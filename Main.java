import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Transaction t1 = new Transaction("Fried Chicken", 100.0, "18/01/2026", "Expense");
        
        System.out.println("--- your recording ---");
        System.out.println(t1); 
    }
}