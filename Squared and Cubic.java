import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i=1;i<=num;i++)
             System.out.println(i +" "+ i*i +" "+ i*i*i); 
    }
}