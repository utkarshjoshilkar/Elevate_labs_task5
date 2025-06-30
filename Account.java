import java.util.ArrayList;

public class Account {

    private int accountNo;
    private String accHolderName;
    private double balance;
    private ArrayList<String> transaction;

    public Account(String accHolderName, int accountNo, double balance, String email) {
        this.accHolderName = accHolderName;
        this.accountNo = accountNo;
        this.balance = balance;
        this.transaction = new ArrayList<>();
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            this.transaction.add("Deposited rs " + amount + " | New Balance: rs " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance! Current: " + this.balance +" rs");
        } else if (amount > 0) {
            this.balance -= amount;
            this.transaction.add("Withdrawn rs " + amount + " | Remaining: rs " + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void getTransactionHistory() {
        if (transaction.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction history of " + this.accHolderName + ":");
            for (String trans : transaction) {
                System.out.println("- " + trans);
            }
        }
    }
}
