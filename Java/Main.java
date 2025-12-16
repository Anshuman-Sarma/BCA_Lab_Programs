// AnshumanSarma_WAP to demonstrate a library management system using packages


import books.Book;
import books.BookManager;
import users.User;
import users.UserManager;
import transactions.Transaction;
import transactions.TransactionManager;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Demonstrate the usage of classes and methods from other packages
        BookManager bookManager = new BookManager();
        UserManager userManager = new UserManager();
        TransactionManager transactionManager = new TransactionManager();

        // Adding books
        Book book1 = new Book("Title1", "Author1", "ISBN1", "Genre1");
        Book book2 = new Book("Title2", "Author2", "ISBN2", "Genre2");
        bookManager.addBook(book1);
        bookManager.addBook(book2);

        // Adding users
        User user1 = new User("User1", 1, "Student");
        User user2 = new User("User2", 2, "Faculty");
        userManager.addUser(user1);
        userManager.addUser(user2);

        // Adding transactions
        Transaction transaction1 = new Transaction(1, 1, "ISBN1", "Borrow", new Date());
        Transaction transaction2 = new Transaction(2, 2, "ISBN2", "Return", new Date());
        transactionManager.addTransaction(transaction1);
        transactionManager.addTransaction(transaction2);

        // Displaying all books
        System.out.println("All Books:");
        for (Book book : bookManager.getAllBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Displaying all users
        System.out.println("\nAll Users:");
        for (User user : userManager.getAllUsers()) {
            System.out.println(user.getName() + " (" + user.getRole() + ")");
        }

        // Displaying all transactions
        System.out.println("\nAll Transactions:");
        for (Transaction transaction : transactionManager.getAllTransactions()) {
            System.out.println("Transaction ID: " + transaction.getTransactionID() +
                    ", User ID: " + transaction.getUserID() +
                    ", Book ISBN: " + transaction.getBookISBN() +
                    ", Type: " + transaction.getTransactionType() +
                    ", Date: " + transaction.getTransactionDate());
        }
    }
}