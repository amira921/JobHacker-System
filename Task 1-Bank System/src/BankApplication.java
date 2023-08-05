import java.util.*;

public class BankApplication {
    static Bank bank = new Bank();
    static Scanner scanner;
    static String accountNumber;
    static String accountHolderName;
    static double balance , amount;

    public static void main(String[] args) {
        Home();
    }
    static void Home(){
        scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Welcome to The Bank Application!");

        try{
            while (true) {
                System.out.println("---------------------------------------------");
                System.out.println("Select an option");
                System.out.println("1. Customer");
                System.out.println("2. Employee");
                System.out.println("---------------------------------------------");
                System.out.print("Enter option: ");
                int choice = scanner.nextInt();
                System.out.println("---------------------------------------------");

                switch (choice) {
                    case 1:
                        CaseCustomer();
                        break;
                    case 2:
                        CaseEmployee();
                        break;
                    default:
                        System.out.println("!!   Enter a Valid Choice   !!");
                        System.out.println("---------------------------------------------");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("---------------------------------------------");
            System.out.println("You entered invalid input, try again!");
            Home();
        }
    }
     static void CaseCustomer() {
        scanner = new Scanner(System.in);
        try{
           System.out.println("Welcome Customer!");
           System.out.println("---------------------------------------------");

            // The customer has to enter the account number first to be verified and if found, the customer can interact with the application.
            // The customer has 3 attempts to verify the account number.
            for(int i=0;i<3;i++){
                System.out.print("Enter your account number: ");
                accountNumber = scanner.next();
                SavingsAccount account = bank.findAccount(accountNumber);

                if (account == null) {
                    System.out.println("Account not found, try again!");
                    continue;
                }


                while (true) {
                    System.out.println("---------------------------------------------");
                    System.out.println("Select an option");
                    System.out.println("1. Deposit money");
                    System.out.println("2. Withdraw money");
                    System.out.println("3. View balance");
                    System.out.println("4. Calculate Interest");
                    System.out.println("5. Exit");
                    System.out.println("---------------------------------------------");
                    System.out.print("Enter option: ");
                    int choice = scanner.nextInt();
                    System.out.println("---------------------------------------------");

                    switch (choice){
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            amount = scanner.nextDouble();
                            bank.deposit(account, amount);
                            break;
                        case 2:
                            System.out.print("Enter withdraw amount: ");
                            amount = scanner.nextDouble();
                            bank.withdraw(account, amount);
                            break;
                        case 3:
                            bank.displayBalance(account);
                            break;
                        case 4:
                            new SavingsAccount(account.getAccountNumber(),account.getAccountHolderName(),account.getBalance()).calculateInterest();
                        case 5:
                            Home();
                        default:
                            System.out.println("Enter a valid option");
                            System.out.println("---------------------------------------------");
                    }
                }
            }
            System.out.println("You have exceeded the maximum number of attempts, try again later!");
            Home();
        } catch (InputMismatchException e){
            System.out.println("You entered invalid input, try again!");
            CaseCustomer();
        }
    }

     static void CaseEmployee() {
         scanner = new Scanner(System.in);
         try{
             System.out.println("Welcome Employee!");

             while (true) {
                 System.out.println("---------------------------------------------");
                 System.out.println("Select an option");
                 System.out.println("1. Open a savings account");
                 System.out.println("2. Exit");
                 System.out.println("---------------------------------------------");
                 System.out.print("Enter option: ");
                 int choice = scanner.nextInt();
                 System.out.println("---------------------------------------------");

                 switch (choice){
                     case 1:
                         System.out.print("Enter account number: ");
                         accountNumber = scanner.nextLine();
                         scanner.nextLine(); // consume newline
                         System.out.print("Enter account holder name: ");
                         accountHolderName = scanner.nextLine();
                         System.out.print("Enter balance: ");
                         balance = scanner.nextDouble();
                         bank.addAccount(new SavingsAccount(accountNumber,accountHolderName,balance));
                         break;
                     case 2:
                         Home();
                     default:
                         System.out.println("Enter a valid option");
                         System.out.println("---------------------------------------------");
                 }
             }
         } catch (InputMismatchException e){
             System.out.println("You entered invalid input, try again!");
             CaseEmployee();
        }
    }
}