// AnshumanSarma_WAP to simulate a simple banking system using arrays and menu-driven program


import java.util.Scanner;

class Account {

    String[] accountHolder = new String[10];
    int[] accountNo = new int[10];
    int[] deposit = new int[10];
    int[] withdraw = new int[10];

    int index = 0;
    int balance = 0;
    int p, o;

    void accountName(String a, int b) {
        Scanner scanner = new Scanner(System.in);

        accountHolder[index] = a;
        accountNo[index] = b;
        index++;
    }

    void depositAmount(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        p = scanner.nextInt();

        for (int i = 0; i < index; i++) {
            if (accountNo[i] == p) {
                System.out.println("Enter the amount to deposit: ");
                o = scanner.nextInt();
                balance = deposit[i] + o;
                deposit[i] = balance;
                break;
            }
        }
    }

    void withdrawAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        p = scanner.nextInt();

        for (int i = 0; i < index; i++) {
            if (accountNo[i] == p) {
                System.out.println("Enter the amount to withdraw: ");
                o = scanner.nextInt();
                if (balance - o > 0) {
                    int result = deposit[i] - o;
                    withdraw[i] = result;
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;
            }
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Details:");
        for (int i = 0; i < index; i++) {
            System.out.println("Account Holder: " + accountHolder[i]);
            System.out.println("Account Number: " + accountNo[i]);
            System.out.println("Deposit Amount: " + deposit[i]);
            System.out.println("Withdraw Amount: " + withdraw[i]);
        }
    }

    public static void main(String args[]) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    int accNumber = scanner.nextInt();
                    account.accountName(name, accNumber);
                    break;
                case 2:
                    account.depositAmount(0);
                    break;
                case 3:
                    account.withdrawAmount();
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}