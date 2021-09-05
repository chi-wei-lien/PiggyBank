package controller;

import datatemplate.*;


public class Data {
    public static void loadData(){
        System.out.println(FileController.expenseDataSet);
        for(int i = 0; i < FileController.expenseDataSet.size(); i++){
            Expense expense = FileController.expenseDataSet.get(i);
            System.out.println("expense: " + expense.getExpense() + "; data: " + expense.getDate() + "; detail: " + expense.getDetail());
        }
        for(int i = 0; i < FileController.incomeDataSet.size(); i++){
            Income income = FileController.incomeDataSet.get(i);
            System.out.println("income: " + income.getIncome() + "; data: " + income.getDate() + "; detail: " + income.getDetail());
        }
    }
}
