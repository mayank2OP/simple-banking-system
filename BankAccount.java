public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private static int accountCounter = 1000;
    
    // Constructor
    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountNumber = "ACC" + (++accountCounter);
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit >= 0 ? initialDeposit : 0;
    }
    
    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Deposit money
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            System.out.println("New balance: $" + balance);
            return true;
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
            return false;
        }
    }
    
    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: $" + balance);
            return false;
        }
        
        balance -= amount;
        System.out.println("Successfully withdrawn $" + amount);
        System.out.println("New balance: $" + balance);
        return true;
    }
    
    // Check balance
    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
    
    // Transfer money to another account
    public boolean transferTo(BankAccount targetAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Insufficient funds for transfer. Current balance: $" + balance);
            return false;
        }
        
        this.balance -= amount;
        targetAccount.balance += amount;
        
        System.out.println("Successfully transferred $" + amount + " to " + targetAccount.getAccountHolderName());
        System.out.println("Your new balance: $" + this.balance);
        return true;
    }
    
    @Override
    public String toString() {
        return "Account[" + accountNumber + "] - " + accountHolderName + " - Balance: $" + balance;
    }
}