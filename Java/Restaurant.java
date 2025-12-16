//AnshumanSarma_WAP to implement restaurant management system.


import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menuItems = {"Pizza", "Burger", "Pasta", "Salad"};
        double[] menuPrices = {8.99, 5.99, 7.99, 4.99};
        String[] menuOrder = new String[10]; // Array to store the names of items ordered
        double total = 0;

        System.out.println("Welcome to the restaurant! Here's the menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - $" + menuPrices[i]);
        }
        System.out.println("Please enter the number of the item you want to order (0 to finish):");

        int orderCount = 0; // Keep track of the number of items ordered
        int choice;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume non-integer input
            }
            choice = scanner.nextInt();
            if (choice > 0 && choice <= menuItems.length) {
                if (orderCount < menuOrder.length) {
                    menuOrder[orderCount] = menuItems[choice - 1]; // Store the name of the chosen item
                    total += menuPrices[choice - 1];
                    orderCount++;
                    System.out.println("Added " + menuItems[choice - 1] + " to your order.");
                } else {
                    System.out.println("You've reached the maximum number of orders.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid menu option. Please choose again.");
            }
        } while (choice != 0);

        System.out.println("Preparing bill...");
        System.out.println("Items Ordered:");
        for (int i = 0; i < orderCount; i++) {
            System.out.println(menuOrder[i] + " - $" + menuPrices[i]);
        }
        System.out.println("Total: $" + total);
        System.out.println("Thank you for dining with us!");
    }
}
