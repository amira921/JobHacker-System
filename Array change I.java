import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int[] nums = new int[20];

        for(int i=0;i<20;i++) {
            nums[i] = input.nextInt();
        }

        for(int i=0,j=19 ; i<20 && j>=0 ; i++,j--) {
            System.out.printf("N[%d] = %d\n", i, nums[j]);
        }
 
    }
 
}