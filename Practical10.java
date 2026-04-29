class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }
    void calculateInterest() {
        double interest = balance * interest_rate / 100;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Interest Earned: " + interest);
    }
    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Zarna", 10000);
        BankAccount acc2 = new BankAccount("Riya", 20000);

        acc1.calculateInterest();
        acc2.calculateInterest();

        System.out.println("\nUpdating Interest Rate...\n");
        BankAccount.updateInterestRate(7.0);

        acc1.calculateInterest();
        acc2.calculateInterest();
    }
}
