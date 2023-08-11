import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 , num2 ;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Enter first integer: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                num2 = scanner.nextInt();

                System.out.println("You entered " + num1 + " and " + num2 + "\nThe summation is: " + (num1 + num2));
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Enter integers only.");
                scanner.nextLine();
            }
        }
    }
}
