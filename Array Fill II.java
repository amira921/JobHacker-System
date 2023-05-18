import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        int[] nums = new int[1000];

        int iter = 0;
        for(int i=0;i<1000;i++){
            System.out.printf("N[%d] = %d\n", i, iter);
            if(iter < t-1) iter++; else iter = 0;
        }
 
    }
 
}