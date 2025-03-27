package bank;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    public void calculateInterest() {
        System.out.println("No interest for transaction account");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overDraftLimit)) {
            balance -= amount;
            System.out.println(amount + " withdrawn from account " + getAccountNumber());
        } else {
            System.out.println("Invalid amount or exceeds overdraft limit");
        }
    }
}
