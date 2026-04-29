class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.05;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance * Math.pow(1.07, years);
    }
}

public class Main1 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Zarna", 10000);
        sa.deposit(2000);
        sa.checkBalance();
        System.out.println("Interest: " + sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102, "Riya", 20000);
        fd.checkBalance();
        System.out.println("Maturity Amount (2 years): " + fd.maturityAmount(2));
    }
}
