package datatemplate;
import controller.*;
import java.util.Date;

public class Expense {
    private double expense;
    private String date;
    private String detail;

    public Expense(double expense, String detail, String date){
        this.date = date;
        this.expense = expense;
        this.detail = detail;
    }

    public static void addNewExpense(double newExpense, String detail, Date date){
        FileController.writeData("e:" + newExpense + " d:" + date + " s:" + detail + " "); //s means string
    }

    public double getExpense(){
        return expense;
    }

    public String getDate(){
        return date;
    }

    public String getDetail(){
        return detail;
    }
}
