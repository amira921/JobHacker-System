import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

            double r = input.nextDouble();
            double area = r * r * 3.14159;

            System.out.printf("A=%.4f%n", area);
 
    }
 
}