import java.util.Scanner;

class UserAccount {
    private double balance;

    public UserAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs." + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: Rs." + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }
}

class ATM {
    private UserAccount userAccount;

    public ATM(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: Rs." + userAccount.getBalance());
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: Rs.");
        double amount = scanner.nextDouble();
        userAccount.deposit(amount);
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: Rs.");
        double amount = scanner.nextDouble();
        userAccount.withdraw(amount);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Visit again!!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        } while (choice != 4);
    }
}

public class task3 {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
