import java.util.*;
import p2.Account;

class Main2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Account myAccount = null;

        while (true) {
            System.out.println("\n--- Welcome to the Bank ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Print Details");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    
                    sc.nextLine();
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your account number: ");
                    double accNo = sc.nextDouble();
                    System.out.print("Enter initial balance: ");
                    int initial = sc.nextInt();
                    myAccount = new Account(accNo, name, initial);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (myAccount == null) {
                        System.out.println("Create account first!");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    myAccount.deposit(depositAmount);
                    break;

                case 3:
                    if (myAccount == null) {
                        System.out.println("Create account first!");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    int amount = sc.nextInt();
                    myAccount.withdraw(amount);
                    break;

                case 4:
                    if (myAccount == null) {
                        System.out.println("Create account first!");
                        break;
                    }
                    System.out.println("Current Balance: " + myAccount.getBalance());
                    break;

                case 5:
                    if (myAccount == null) {
                        System.out.println("Create account first!");
                        break;
                    }
                    myAccount.printDetails();
                    break;

                case 6:
                    System.out.println("Thank you");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
