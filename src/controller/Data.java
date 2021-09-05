package controller;

public class Data {
    public static void loadData(){
        System.out.println(FileController.expenseDataSet.get(1).getExpense());
        System.out.println(FileController.incomeDataSet.get(1).getIncome());
    }
}
