public class Account {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(long accountNumber, String accountHolderName,double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance, your balance: "+ balance +"\nwithdraw less amount!");
            return;
        }
        balance -= amount;
        System.out.println("$" + amount + " withdrawn successfully");
    }
}