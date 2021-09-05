package controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import datatemplate.*;


public class CommandController {
    public static void doCommand(int command){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        switch(command){
            case 1:
                System.out.println("Please enter the amount of expense you have spent: ");
                double newExpense = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please provide detail of this expense: ");
                String expenseDetail = scanner.nextLine();
                System.out.println("Please provide the date of this expense (DD/MM/YYYY): ");
                String expenseDateStr = scanner.nextLine();
                try{
                    Date expenseDate = sdf.parse(expenseDateStr);
                    Expense.addNewExpense(newExpense, expenseDetail, expenseDate);
                } catch (ParseException error){
                   System.out.println("fail to generate Date");
                   error.printStackTrace();
                }
                FileController.readData(); //reread data
                break;
            case 2:
                System.out.println("Please enter the amount of income you have received: ");
                double newIncome = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please provide detail of this income: ");
                String incomeDetail = scanner.nextLine();
                System.out.println("Please provide the date of this expense (DD/MM/YYYY): ");
                String incomeDateStr = scanner.nextLine();
                try{
                    Date incomeDate = sdf.parse(incomeDateStr);
                    Income.addNewIncome(newIncome, incomeDetail, incomeDate);
                } catch (ParseException error){
                    System.out.println("fail to generate Date");
                    error.printStackTrace();
                }
                FileController.readData(); //reread data
                break;
            case 3:
                Data.loadData();
                break;
            case 4:
                System.exit(0);
        }
    }
}
