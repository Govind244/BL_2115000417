class BankAccount{
	private static String bankName = "NO Bank";
	private final int accountNumber;
	private String accountHolderName;
	private static int totalAccounts = 0;
	private double balance;
	
	public BankAccount(String accountHolderName, int accountNumber, double balance){
		this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
	}
	
	public static void getTotalAccounts(){
	System.out.println("\nTotal Accounts are: "+ totalAccounts);
	}
	
	public void displayAccountDetails() {
        if (this instanceof BankAccount) {
			System.out.println("\nAccount Details: ");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account instance.");
        }
    }
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Bob", 1002, 7000.0);
        
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        
        BankAccount.getTotalAccounts();
    }
}