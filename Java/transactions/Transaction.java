// AnshumanSarma_WAP to create a Transaction class using encapsulation


package transactions;

import java.util.Date;

public class Transaction {
    private int transactionID;
    private int userID;
    private String bookISBN;
    private String transactionType;
    private Date transactionDate;

    public Transaction(int transactionID, int userID, String bookISBN, 
    String transactionType, Date transactionDate) {
        this.transactionID = transactionID;
        this.userID = userID;
        this.bookISBN = bookISBN;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
    }

    // Getters and setters
    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}