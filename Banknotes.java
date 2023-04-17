import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number);
        
        int [] banknotes = {100,50,20,10,5,2,1};

        int num;
        for(int i=0;i<banknotes.length;i++) {
            num = number / banknotes[i];
            number = number % banknotes[i];
            System.out.println("" + num + " nota(s) de R$ " + banknotes[i] + ",00");
        }
 
    }
    
}
 