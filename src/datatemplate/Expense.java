package datatemplate;
import controller.*;
import java.util.Date;

public class Expense {
    private double expense;
    private String date;
    private String detail;

    public Expense(double expense, String detail){
        this.expense = expense;
        Date today = new Date();
        date = today.toString();
        this.detail = detail;
    }

    public static void addNewExpense(double newExpense, String detail){
        Date now = new Date();
        FileController.writeData("e:" + newExpense + " d:" + now + " s:" + detail + " "); //s means string
    }

    public double getExpense(){
        return expense;
    }
}
