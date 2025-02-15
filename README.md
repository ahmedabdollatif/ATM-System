# ATM Application

## Summary
The ATM Application is a Java-based graphical program that simulates basic ATM functionalities. It enables users to perform key banking operations such as withdrawing cash, depositing funds, and checking their account balance through an intuitive GUI built using Java Swing.

## Features
- **Graphical User Interface (GUI):** A user-friendly interface for interacting with the ATM system.
- **Withdraw Cash:** Allows users to withdraw a specified amount from their account, with proper validation for sufficient funds.
- **Deposit Funds:** Enables users to deposit money into their account, ensuring that valid amounts are entered.
- **Check Account Balance:** Displays the current balance in an easy-to-read text area.
- **Robust Error Handling:** Provides informative error messages for invalid inputs and transaction errors.
- **Exit Option:** Offers a simple way to exit the application gracefully.

## How to Use
1. **Launch the Application:**
   - Compile and run the `Main.java` file.
2. **Interface Overview:**
   - **Display Area:** Shows messages, transaction confirmations, and the current account balance.
   - **Amount Field:** A text field for entering the transaction amount.
   - **Operation Buttons:**
     - **Withdraw:** Click to withdraw funds (after entering a valid amount).
     - **Deposit:** Click to deposit funds (after entering a valid amount).
     - **Check Balance:** Click to display the current account balance.
     - **Exit:** Click to close the application.
3. **Performing Transactions:**
   - Enter the desired amount in the **Amount** field.
   - Click the corresponding button to execute the operation.
   - The application will validate your input and update the display area with the transaction result and new balance.
4. **Exiting the Application:**
   - Click the **Exit** button. A farewell message will be displayed before the application terminates.

## Prerequisites
- **Java Development Kit (JDK):** Ensure that JDK 8 or later is installed on your system.
- **Java Swing:** This application utilizes Java Swing, which is part of the standard JDK.

## Compilation and Execution
1. **Compile the Code:**
   ```bash
   javac Main.java
   ```
2. **Run the Application:**
   ```bash
   java Main
   ```

## Example Usage
When you launch the application, you will see a window with the following components:
- A display area with a welcome message and the current balance.
- An amount input field labeled "Amount:".
- Four buttons: Withdraw, Deposit, Check Balance, and Exit.

For instance:
- **To Withdraw Funds:**  
  Enter an amount (e.g., 500) in the text field and click **Withdraw**. If the amount is valid and does not exceed the balance, the withdrawal is processed and the display area updates accordingly.
- **To Deposit Funds:**  
  Enter an amount (e.g., 300) in the text field and click **Deposit**. The deposit will be processed, and the new balance will be displayed.
- **To Check the Balance:**  
  Click **Check Balance** to view the current balance.
- **To Exit:**  
  Click **Exit** to close the application after receiving a thank-you message.

## Author
Developed by Ahmed Abdellatif.
