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
                scanner.nextLine();
                System.out.println("Please provide detail of this expense: ");
                String expenseDetail = scanner.nextLine();
                Expense.addNewExpense(newExpense, expenseDetail);
                FileController.readData(); //reread data
                break;
            case 2:
                System.out.println("Please enter the amount of income you have received: ");
                double newIncome = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please provide detail of this income: ");
                String incomeDetail = scanner.nextLine();
                Income.addNewIncome(newIncome, incomeDetail);
                FileController.readData(); //reread data
                break;
            case 3:
                Data.loadData();
        }
    }
}
