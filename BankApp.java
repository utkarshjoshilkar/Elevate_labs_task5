import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        addUser(accounts);

        Account currentUser = null;
        while (currentUser == null) {
            currentUser = checkUser(sc, accounts);
            if (currentUser == null) {
                System.out.println("User not found! Please try again.\n");
            }
        }

        while (true) {
            System.out.println("\n###############################");
            System.out.println("Welcome, " + currentUser.getAccHolderName());
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.println("###############################");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Current Balance: " + currentUser.getBalance()+" rs");
                    break;
                }
                case 2: {
                    System.out.print("Enter the amount to deposit: ");
                    double amount = sc.nextDouble();
                    currentUser.deposit(amount);
                    break;
                }
                case 3: {
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = sc.nextDouble();
                    currentUser.withdraw(amount);
                    break;
                }
                case 4: {
                    currentUser.getTransactionHistory();
                    break;
                }
                case 5: {
                    System.out.println("Thank you for using BankApp. Goodbye!");
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("Invalid option. Please choose from 1 to 5.");
                }
            }
        }
    }

    public static void addUser(ArrayList<Account> accounts) {
        accounts.add(new Account("Utkarsh", 101, 1000, "utkarsh@example.com"));
        accounts.add(new Account("Vinit", 102, 2000, "vinit@example.com"));
        accounts.add(new Account("Pranav", 104, 1500, "pranav@example.com"));
        accounts.add(new Account("Atharv", 105, 3000, "atharv@example.com"));
        accounts.add(new Account("Sudesh", 106, 2500, "sudesh@example.com"));
        accounts.add(new Account("Prathmesh", 107, 3500, "prathmesh@example.com"));
        accounts.add(new Account("Aditya", 108, 4000, "aditya@example.com"));
    }

    public static Account checkUser(Scanner sc, ArrayList<Account> accounts) {
        System.out.print("Enter your name: ");
        String name = sc.next();

        for (Account acc : accounts) {
            if (acc.getAccHolderName().equalsIgnoreCase(name)) {
                return acc;
            }
        }
        return null;
    }
}
