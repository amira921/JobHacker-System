import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int line = input.nextInt();
        double[][] mat = new double[line+1][12];
        input.nextLine();
        String operation = input.nextLine();

        double sum = 0;
        
        for(int i = 0; i < line+1; i++) {
            for(int j = 0; j < 12; j++){
                mat[i][j] = input.nextDouble();
                if(i == line) sum += mat[i][j];
            }
        }

        if(operation == "S") System.out.println(sum); else System.out.println(sum/12);
    }
 
}