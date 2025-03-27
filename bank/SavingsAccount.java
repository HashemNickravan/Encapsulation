package bank;

public class SavingsAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest " + interest + " added to savings account");
    }
}