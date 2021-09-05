package controller;
import java.util.Scanner;
import datatemplate.*;


public class CommandController {
    public static void doCommand(int command){
        Scanner scanner = new Scanner(System.in);
        switch(command){
            case 1:
                System.out.println("Please enter the amount of expense you have spent: ");
                double newExpense = scanner.nextDouble();
                Expense.addNewExpense(newExpense);
                break;
            case 2:
                System.out.println("Please enter the amount of income you have received: ");
                double newIncome = scanner.nextDouble();
                Income.addNewIncome(newIncome);
                break;
            case 3:
                Data.loadData();
        }
    }
}
