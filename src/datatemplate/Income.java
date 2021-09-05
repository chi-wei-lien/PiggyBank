package datatemplate;
import java.util.Date;
import controller.*;

public class Income {
    private double income;
    private String date;
    private String detail;

    public Income(double income){
        this.income = income;
        Date today = new Date();
        date = today.toString();
    }

    public static void addNewIncome(double newIncome){
        Date now = new Date();
        FileController.writeData("i:" + newIncome + " d: " + now);
    }

    public double getIncome(){
        return income;
    }
}
