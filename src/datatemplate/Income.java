package datatemplate;
import java.util.Date;
import controller.*;

public class Income {
    private double income;
    private String date;
    private String detail;

    public Income(double income, String detail, String date){
        this.income = income;
        this.date = date;
        this.detail = detail;
    }

    public static void addNewIncome(double newIncome, String detail, Date date){
        FileController.writeData("i:" + newIncome + " d:" + date + " s:" + detail + " ");
    }

    public double getIncome(){
        return income;
    }

    public String getDetail(){
        return detail;
    }

    public String getDate(){
        return date;
    }
}
