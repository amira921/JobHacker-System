import java.util.ArrayList;
public class Bank {
    ArrayList<SavingsAccount>accounts;
    Bank(){
        accounts = new ArrayList<>();
    }
    public void addAccount(SavingsAccount account) {
        accounts.add(account);
        System.out.println("Account added successfully!");
    }

    public SavingsAccount findAccount(String accountNumber) {
        for (SavingsAccount account: accounts)
            if (account.getAccountNumber().equals(accountNumber)) return account;
        return null;
    }

    public void deposit(SavingsAccount account, double amount) {
        account.deposit(amount);
        System.out.println("$" + amount + " deposited successfully");
    }

    public void withdraw(SavingsAccount account, double amount) {
        account.withdraw(amount);
    }

    public void displayBalance(SavingsAccount account) {
        System.out.println("Account holder: " + account.getAccountHolderName());
        System.out.println("Account balance: $" + account.getBalance());
    }
}