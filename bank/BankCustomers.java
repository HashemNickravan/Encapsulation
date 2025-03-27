package bank;

import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("Account Holder: " + account.getAccountHolderName() +
                    ", Account Number: " + account.getAccountNumber() +
                    ", Balance: " + account.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account found: " + account.getAccountHolderName() +
                        ", Balance: " + account.getBalance());
                return account;
            }
        }
        System.out.println("Account not found");
        return null;
    }
}