public class SavingsAccount extends Account {
    private double interestRate = 0.05; // assume the interest rate = %5

    public SavingsAccount(long accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void calculateInterest() {
        System.out.println("The Interest Rate = " + getBalance() * interestRate);
    }
}