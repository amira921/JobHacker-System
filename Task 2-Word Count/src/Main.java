import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file =new FileInputStream("Lincoln.txt");
            
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                count++;
            }
            System.out.println("The Lincoln file contains " + count + " words.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
