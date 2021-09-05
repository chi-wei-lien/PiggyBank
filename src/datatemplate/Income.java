package datatemplate;
import java.util.Date;
import controller.*;

public class Income {
    public double income = 0;
    public String date = "";

    public Income(double income){
        this.income = income;
        Date today = new Date();
        date = today.toString();
    }

    public static void addNewIncome(double newIncome){
        Date now = new Date();
        FileController.writeData("i:" + String.valueOf(newIncome) + " d: " + now);
    }

    public void getMoney(){
        System.out.println(income);
    }
}
