

# Bank App

A simple console-based Bank Management System developed in Java that allows users to perform fundamental banking operations via a text-based menu interface.

---

## Features

* **Account Creation**: Register an account with account holder details.
* **Deposit Money**: Add funds to the account.
* **Withdraw Money**: Withdraw funds with balance check validation.
* **View Balance**: Display current account balance.
* **Transaction History**: Track all deposits and withdrawals.
* **Interactive Menu**: Easy-to-navigate console menu system.

---

## Project Structure

```
src/
└── com/elevateLabs/
    ├── Account.java          // Account-related data and operations
    └── BankManagement.java   // Main user interface and menu-driven logic
```

---

## Classes Overview

### Account.java

Handles all operations related to a bank account.

* **Methods**:

  * `deposit(double amount)` – Adds funds and logs the transaction.
  * `withdraw(double amount)` – Checks balance and processes withdrawal.
  * `getBalance()` – Returns the current balance.
  * `TransactionHistory()` – Displays a list of all transactions.

* **Data Members**:

  * `accountHolder` – Name of the account holder.
  * `balance` – Current balance.
  * `history` – Stores all transaction records.

---

### BankManagement.java

Provides the main interface and logic for user interaction.

* Displays a menu for deposit, withdrawal, balance check, transaction history, and exit.
* Captures and processes user inputs.
* Manages program flow and invokes account operations.

---

## How to Run

### Prerequisites

* Java Development Kit (JDK 8 or above)
* Java-supporting IDE (like Eclipse, IntelliJ, VS Code) or command-line terminal

### Run via Command Line

1. Clone the repository:

   ```bash
   git clone https://github.com/utkarshjoshilkar/Elevate_labs_task5
   cd Elevate_labs_task5
   ```

2. Compile the source files:

   ```bash
   javac com/elevateLabs/*.java
   ```

3. Run the application:

   ```bash
   java com.elevateLabs.BankManagement
   ```

### Run via IDE

1. Open the project in your Java IDE.
2. Locate and run the `BankManagement.java` file.

---

## Sample Console Output

```
Enter the account holder name: John Doe
Welcome, John Doe

**** Bank Menu ****
1. Deposit
2. Withdraw
3. View transaction history
4. View total balance
5. Exit
********************

Enter your choice: 1
Enter the amount to deposit: 1000
$1000.0 Deposited

Enter your choice: 4
Total balance is 1000.0
```

---

## Input Validation

* Deposits accept only positive values.
* Withdrawals require a sufficient account balance.
* Handles incorrect menu inputs gracefully.

---

## Future Enhancements

* Unique account number generation
* Support for managing multiple accounts
* Interest calculation feature
* Account types (e.g., Savings, Current)
* File or database-based data persistence
* Funds transfer between accounts
* PIN-based account authentication

---

## Note

This project is developed as a learning exercise. For real-world use, ensure enhanced security, exception handling, and data persistence mechanisms are implemented.

