import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
class ATM {
    private Map<String, Account> accounts;
    private Scanner scanner;
    public ATM() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
    }
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }
    public void start() {
        while (true) {
            System.out.println("\nATM System:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 4) {
                System.out.println("Exiting ATM. Thank you!");
                break;
            }
            System.out.print("Enter Account Number: ");
            String accountNumber = scanner.nextLine();
            Account account = accounts.get(accountNumber);
            if (account == null) {
                System.out.println("Account not found.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
