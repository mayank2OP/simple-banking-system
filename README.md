\# Simple Banking System



A console-based banking application built in Java that allows users to perform basic banking operations.



\## Features



\- \*\*Create Account\*\*: Open new bank accounts with initial deposits

\- \*\*Deposit Money\*\*: Add funds to existing accounts

\- \*\*Withdraw Money\*\*: Remove funds from accounts (with balance validation)

\- \*\*Check Balance\*\*: View account details and current balance

\- \*\*Transfer Money\*\*: Move funds between accounts

\- \*\*Account Management\*\*: View all accounts in the system



\## Project Structure



```

SimpleBankingSystem/

├── BankAccount.java      # Account class with banking operations

├── BankingSystem.java    # Main application with user interface

└── README.md            # Project documentation

```



\## How to Run



\### Prerequisites

\- Java Development Kit (JDK) 8 or higher

\- Command line interface (Terminal/Command Prompt)



\### Running the Application



1\. \*\*Clone the repository\*\*

&nbsp;  ```bash

&nbsp;  git clone https://github.com/yourusername/simple-banking-system.git

&nbsp;  cd simple-banking-system

&nbsp;  ```



2\. \*\*Compile the Java files\*\*

&nbsp;  ```bash

&nbsp;  javac \*.java

&nbsp;  ```



3\. \*\*Run the application\*\*

&nbsp;  ```bash

&nbsp;  java BankingSystem

&nbsp;  ```



\## Usage Guide



1\. \*\*Start the application\*\* - Run `java BankingSystem`

2\. \*\*Create accounts\*\* - Choose option 1 to create new bank accounts

3\. \*\*Perform transactions\*\* - Use options 2-5 for banking operations

4\. \*\*View accounts\*\* - Option 6 shows all accounts in the system

5\. \*\*Exit\*\* - Option 7 to close the application



\### Sample Usage



```

Welcome to Simple Banking System!



========== SIMPLE BANKING SYSTEM ==========

1\. Create New Account

2\. Deposit Money

3\. Withdraw Money

4\. Check Balance

5\. Transfer Money

6\. Display All Accounts

7\. Exit

==========================================

Choose an option: 1



Enter account holder name: John Doe

Enter initial deposit amount: $1000



Account created successfully!

Account Number: ACC1001

Account Holder: John Doe

Initial Balance: $1000.0

```



\## Key Classes



\### BankAccount

\- Manages individual account data and operations

\- Auto-generates unique account numbers

\- Handles deposits, withdrawals, and transfers

\- Validates transaction amounts



\### BankingSystem

\- Main application controller

\- User interface and menu system

\- Account management and lookup

\- Input validation and error handling



\## Features Implemented



✅ Account creation with auto-generated account numbers  

✅ Deposit and withdrawal with validation  

✅ Balance inquiry  

✅ Money transfer between accounts  

✅ Account listing  

✅ Input validation and error handling  

✅ User-friendly console interface  



\## Learning Objectives



This project demonstrates:

\- Object-Oriented Programming (OOP) concepts

\- Class design and encapsulation

\- Data validation and error handling

\- User input processing

\- Collection management (HashMap)

\- Console application development



\## Future Enhancements



\- Account types (Savings, Checking)

\- Transaction history

\- Interest calculation

\- Account deletion

\- Data persistence (file storage)

\- PIN/Password authentication



\## Author



Mayank Rawat - mayankrawat460@gmail.com



\## License



This project is created for educational purposes.

