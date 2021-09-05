package controller;
import datatemplate.Expense;
import datatemplate.Income;

import java.io.BufferedWriter;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileController {
    public static Hashtable<Integer, Expense> expenseDataSet = new Hashtable<>();
    public static Hashtable<Integer, Income> incomeDataSet = new Hashtable<>();
    public static void readData(){
        try{
            File dataFile = new File("data.txt");
            Scanner reader = new Scanner(dataFile);
            int expenseDataNum = 0;
            int incomeDataNum = 0;
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String dataDetail = data.substring(data.indexOf("s") + 2);
//                int debug = data.indexOf("e");
//                System.out.println(debug);
                if(data.indexOf("e") < 1){
                    String moneyStr = data.substring(data.indexOf("e") + 2, data.indexOf(" "));
                    expenseDataSet.put(expenseDataNum, new Expense(Double.parseDouble(moneyStr), dataDetail));
//                    System.out.println("e: " + data.substring(data.indexOf("e") + 2, data.indexOf(" "))); //2 is for the character after e (e: )
                    expenseDataNum++;
                } else {
                    String moneyStr = data.substring(data.indexOf("i") + 2, data.indexOf(" "));
                    incomeDataSet.put(incomeDataNum, new Income(Double.parseDouble(moneyStr), dataDetail));
//                    System.out.println("i: " + data.substring(data.indexOf("i") + 2, data.indexOf(" "))); //2 is for the character after i (i: )
                    incomeDataNum++;
                }
            }
        }catch(IOException error){
            System.out.println("System failed to read info from data.txt");
            error.printStackTrace();
        }
    }

    public static void writeData(String newRecord){
        try{
            FileWriter data = new FileWriter("data.txt", true);
            BufferedWriter bw = new BufferedWriter(data);
            bw.write(newRecord);
            bw.newLine();
            bw.close();
            data.close();
        }catch(IOException error){
            System.out.println("System failed to write info to data.txt");
            error.printStackTrace();
        }
    }
}
