class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount checking = new CheckingAccount(102, 3000, 10000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(103, 20000, 5.0, 2);

        savings.displayAccountDetails();
        savings.displayAccountType();

        checking.displayAccountDetails();
        checking.displayAccountType();

        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    double interestRate;
    int duration; 

    public FixedDepositAccount(int accountNumber, double balance, double interestRate, int duration) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account with Interest Rate: " + interestRate + "% for " + duration + " years");
    }
}
