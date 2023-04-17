import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        char operation = input.next().toUpperCase().charAt(0);
        
        double[][] M = new double[12][12];
        double sum = 0;

        for (int i = 0; i < 12; i++) {
        	for (int j = 0; j < 12 ; j++){
        		M[i][j] = input.nextDouble();
        		if (j < i) sum += M[i][j];
        	}
        }

        if (operation == 'M') sum /= ((12 * 12) - 12) / 2; 
    	System.out.println(String.format("%.1f", sum));
    }
	
}