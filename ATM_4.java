import java.util.Scanner;

public class ATM_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 5000;
        int n; // the operation number from the user
        int x; // the amount of money the user will do the operation on
        boolean flag = true;
        while (flag) {
            // Print instructions for the user
            System.out.println("Enter 1 for Withdraw");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Check Balance");
            System.out.println("Enter 4 for EXIT");

            n = in.nextInt(); // take input from user

            // check that the input is valid
            if (n < 1 || n > 4) {
                System.out.println("Input a valid number!");
            }

            if (n == 4) {
                flag = false;
                break;
            }

            // Withdraw
            if (n == 1) {
                if (balance == 0) {
                    System.out.println("There is no money in your account!\n");
                    continue;
                }
                do {
                    System.out.print("Enter money to be withdrawn: ");
                    x = in.nextInt();
                    if (x < 1) {
                        System.out.println("Enter a valid amount of money!");
                        continue;
                    } else if (x > balance) {
                        System.out.printf("The maximum value you can withdraw is: %d\n", balance);
                        continue;
                    }
                    balance -= x;
                    System.out.println("collect your money");
                } while (x < 1);
            }

            // Deposit
            else if (n == 2) {
                do {
                    System.out.print("Enter money to deposit: ");
                    x = in.nextInt();
                    if (x < 1) {
                        System.out.println("Enter a valid amount of money!");
                        continue;
                    }
                    balance += x;
                    System.out.println("Your money has been deposited successfully");
                } while (x < 1);
            }

            // Check balance
            else if (n == 3) {
                System.out.printf("Your Balance: %d\n", balance);
            }
            System.out.println();
        }

        System.out.printf("Thanks for using this app made by 3bdellatif :)");
    }
}
