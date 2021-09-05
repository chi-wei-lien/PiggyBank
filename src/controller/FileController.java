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
    public static Hashtable<Integer, Expense> expenseDataSet = new Hashtable<Integer, Expense>();
    public static Hashtable<Integer, Income> incomeDataSet = new Hashtable<Integer, Income>();
    public static void readData(){

        try{
            File dataFile = new File("data.txt");
            Scanner reader = new Scanner(dataFile);
            int dataNum = 0;
            while (reader.hasNextLine()) {
                String data = reader.nextLine();

                if(data.indexOf("e") < 1){
                    String dataStr = data.substring(data.indexOf("e") + 2, data.indexOf(" "));
                    expenseDataSet.put(dataNum, new Expense(Double.parseDouble(dataStr)));
//                    System.out.println("e: " + data.substring(data.indexOf("e") + 2, data.indexOf(" "))); //2 is for the character after e (e: )
                } else {
                    String dataStr = data.substring(data.indexOf("i") + 2, data.indexOf(" "));
                    incomeDataSet.put(dataNum, new Income(Double.parseDouble(dataStr)));
//                    System.out.println("i: " + data.substring(data.indexOf("i") + 2, data.indexOf(" "))); //2 is for the character after i (i: )
                }
                dataNum++;
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
