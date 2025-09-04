import java.util.*;

public class BankingSystem {
    private Map<String, BankAccount> accounts;
    private Scanner scanner;
    
    public BankingSystem() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
    }
    
    // Create new account
    public void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter initial deposit amount: $");
        double initialDeposit;
        
        try {
            initialDeposit = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount entered. Account creation failed.");
            return;
        }
        
        if (initialDeposit < 0) {
            System.out.println("Initial deposit cannot be negative.");
            return;
        }
        
        BankAccount newAccount = new BankAccount(name, initialDeposit);
        accounts.put(newAccount.getAccountNumber(), newAccount);
        
        System.out.println("\nAccount created successfully!");
        System.out.println("Account Number: " + newAccount.getAccountNumber());
        System.out.println("Account Holder: " + newAccount.getAccountHolderName());
        System.out.println("Initial Balance: $" + newAccount.getBalance());
    }
    
    // Find account by account number
    private BankAccount findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    
    // Deposit money
    public void depositMoney() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        
        System.out.print("Enter deposit amount: $");
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            account.deposit(amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount entered.");
        }
    }
    
    // Withdraw money
    public void withdrawMoney() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        
        System.out.print("Enter withdrawal amount: $");
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            account.withdraw(amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount entered.");
        }
    }
    
    // Check balance
    public void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        
        System.out.println("\n--- Account Details ---");
        account.checkBalance();
    }
    
    // Transfer money
    public void transferMoney() {
        System.out.print("Enter sender account number: ");
        String fromAccountNumber = scanner.nextLine();
        
        BankAccount fromAccount = findAccount(fromAccountNumber);
        if (fromAccount == null) {
            System.out.println("Sender account not found!");
            return;
        }
        
        System.out.print("Enter receiver account number: ");
        String toAccountNumber = scanner.nextLine();
        
        BankAccount toAccount = findAccount(toAccountNumber);
        if (toAccount == null) {
            System.out.println("Receiver account not found!");
            return;
        }
        
        if (fromAccountNumber.equals(toAccountNumber)) {
            System.out.println("Cannot transfer to the same account!");
            return;
        }
        
        System.out.print("Enter transfer amount: $");
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            fromAccount.transferTo(toAccount, amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount entered.");
        }
    }
    
    // Display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found in the system.");
            return;
        }
        
        System.out.println("\n--- All Accounts ---");
        for (BankAccount account : accounts.values()) {
            System.out.println(account);
        }
    }
    
    // Display menu
    public void displayMenu() {
        System.out.println("\n========== SIMPLE BANKING SYSTEM ==========");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Transfer Money");
        System.out.println("6. Display All Accounts");
        System.out.println("7. Exit");
        System.out.println("==========================================");
        System.out.print("Choose an option: ");
    }
    
    // Main application loop
    public void start() {
        System.out.println("Welcome to Simple Banking System!");
        
        while (true) {
            displayMenu();
            
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                
                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        depositMoney();
                        break;
                    case 3:
                        withdrawMoney();
                        break;
                    case 4:
                        checkBalance();
                        break;
                    case 5:
                        transferMoney();
                        break;
                    case 6:
                        displayAllAccounts();
                        break;
                    case 7:
                        System.out.println("Thank you for using Simple Banking System!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
    
    // Main method
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.start();
    }
}