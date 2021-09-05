package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Greeting {
    private static String generatingGreetings(){
        Date now = new Date();
        String greeting;
        SimpleDateFormat currentTime = new SimpleDateFormat("HH");
        int currentHour = Integer.parseInt(currentTime.format(now));
        if(currentHour < 11){
            greeting = "Good Morning Sir.";
        }else if(currentHour < 17){
            greeting = "Good Afternoon Sir.";
        }else{
            greeting = "Good Night Sir.";
        }
        return greeting;
    }

    public static void greet(){
        String greeting = generatingGreetings();
        System.out.println("Welcome to your Piggy Bank.\n");
        Logo.generateLogo();
//        System.out.println(greeting + "\n" + "Loading your data...");
    }
    public static int ask(){
        System.out.println("Please choose one of the command down below: \n"+
                "1.) add new expense.\n" +
                "2.) add new income.\n" +
                "3.) show all expense \n" +
                "4.) exit program.") ;
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        scanner.nextLine();
        return command;
    }
}
