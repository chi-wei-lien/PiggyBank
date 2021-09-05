package datatemplate;
import controller.*;
import java.util.Date;

public class Expense {
    private double expense;
    private String date;
    private String detail;

    public Expense(double expense){
        this.expense = expense;
        Date today = new Date();
        date = today.toString();
    }

    public static void addNewExpense(double newExpense){
        Date now = new Date();
        FileController.writeData("e:" + newExpense + " d:" + now);
    }

    public double getExpense(){
        return expense;
    }
}
