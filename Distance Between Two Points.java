import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble(),
               y1 = input.nextDouble(),
               x2 = input.nextDouble(),
               y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.4f%n", distance);
 
    }
 
}