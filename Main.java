import bank.BankCustomers;
import bank.SavingsAccount;
import bank.TransactionAccount;

public class Main {
    public static void main(String[] args) {
        BankCustomers bankInformation = new BankCustomers();

        // ببخشید اگر رقم‌ها زیادن، اینم از مزایای دلار ۱۰۰هزارتومانیه!
        // ای مردم! ما دیگر به قله رسیدیم:)) (حساب‌های بانکی با موجودی نجومی گواهه این موضوعن:))
        SavingsAccount savingHashem = new SavingsAccount("1", "Hashem", 10_000_000);
        SavingsAccount savingIlia = new SavingsAccount("2", "Ilia", 20_000_000);
        SavingsAccount savingMohammadreza = new SavingsAccount("3", "MohammadReza", 30_000_000);

        TransactionAccount currentArman = new TransactionAccount("4", "Arman", 15_000_000);
        TransactionAccount currentPedram = new TransactionAccount("5", "Pedram", 25_000_000);
        TransactionAccount currentKiana = new TransactionAccount("6", "Kiana", 35_000_000);

        bankInformation.addAccount(savingHashem);
        bankInformation.addAccount(savingIlia);
        bankInformation.addAccount(savingMohammadreza);
        bankInformation.addAccount(currentArman);
        bankInformation.addAccount(currentPedram);
        bankInformation.addAccount(currentKiana);

        bankInformation.findAccount("1");
        bankInformation.findAccount("999");

        System.out.println("Initial balance: " + savingHashem.getBalance() + "Toman ");
        savingHashem.deposit(5_000_000);
        System.out.println("After deposit: " + savingHashem.getBalance() + "Toman ");

        currentArman.deposit(-1_000_000);

        savingHashem.calculateInterest();
        currentArman.calculateInterest();

        savingHashem.withdraw(2_000_000);
        savingIlia.withdraw(-1_000_000);
        savingMohammadreza.withdraw(50_000_000);

        currentArman.withdraw(1_000_000);
        currentPedram.withdraw(30_000_000);
        currentKiana.withdraw(-500_000);

        bankInformation.showAllBalances();
    }
}