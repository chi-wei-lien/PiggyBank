import controller.*;
import view.*;

public class Main {
    public static void main(String args[]){
        FileController.readData();
        Greeting.greet();
        while (true){
            int command = Greeting.ask();
            CommandController.doCommand(command);
        }
    }
}
