import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileManipulation file = new FileManipulation();
         try{
            String path = file.readFromWebToFile("http://liveexample.pearsoncmg.com/data/Scores.txt");
            System.out.println("The summation of words: " + file.getSum(path));
            System.out.println("The average of words: " + file.getAverage(path));
         }catch (IOException e){
             System.out.println(e.getMessage());
         }
    }
}