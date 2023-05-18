import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int num , max = 0 , index=1;

        for(int i=1;i<=100;i++){
             num = input.nextInt();
             if(num > max) {
                 max = num;
                 index = i;
             }
        }

        System.out.println(max);
        System.out.println(index);
    }
}