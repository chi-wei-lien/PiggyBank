package datatemplate;
import controller.*;
import java.util.Date;

public class Expense {
    private double expense = 0;
    private String date = "";
    private String detail = "";

    public Expense(double expense){
        this.expense = expense;
        Date today = new Date();
        date = today.toString();
    }

    public static void addNewExpense(double newExpense){
        Date now = new Date();
        FileController.writeData("e:" + String.valueOf(newExpense) + " d:" + now);
    }

    public void getExpense(){
        System.out.println(expense);
    }
}
