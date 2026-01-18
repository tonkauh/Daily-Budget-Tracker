public class Transaction {
    private String description;
    private double amount;
    private String date;
    private String type; // "Income" or "Expense"

    public Transaction(String description, double amount, String date, String type){
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.type = type;
    }
    public String getDescription(String description){
        return description;
    }
    public double getAmount(double amount){
        return amount;
    }
    public String getDate(String date){
        return date;
    }
    public String getType(String type){
        return type;
    }
    public void setDescription(String description){
        this.description = description;
    }
    // เพิ่มตัวนี้เข้าไปใน Class Transaction เพื่อให้ Print ดูง่ายๆ ครับ
    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f THB (%s)", type, description, amount, date);
    }
}

