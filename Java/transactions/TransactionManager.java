// AnshumanSarma_WAP to manage transactions using ArrayList in Java


package transactions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactionsForUser(int userID) {
        List<Transaction> userTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getUserID() == userID) {
                userTransactions.add(transaction);
            }
        }
        return userTransactions;
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}