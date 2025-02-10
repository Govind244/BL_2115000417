import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private final String accountNumber;
    private final String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited: " + amount + "\n");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount + "\n");
        } else {
            System.out.println("Insufficient balance for withdrawal.\n");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance + "\n");
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan application submitted for " + amount + " by Savings Account holder.\n");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount savings = new SavingsAccount("SA123", "Alice", 10000);
        CurrentAccount current = new CurrentAccount("CA456", "Bob", 20000);

        accounts.add(savings);
        accounts.add(current);

        for (BankAccount account : accounts) {
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest + "\n");

            if (account instanceof Loanable) {
                ((Loanable) account).applyForLoan(50000);
                System.out.println("Loan Eligibility: " + ((Loanable) account).calculateLoanEligibility() + "\n");
            }
        }
    }
}
