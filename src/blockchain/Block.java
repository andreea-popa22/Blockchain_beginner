package blockchain;

import java.util.Arrays;

public class Block {
    private int index;
    private String[] transactions;
    private String timestamp;
    private int blockHashCode;
    private int previousBlockHashCode;

    public Block(int index, String[] transactions, String timestamp, int previousHashCode) {
        this.index = index;
        this.transactions = transactions;
        this.timestamp = timestamp;
        this.previousBlockHashCode = previousHashCode;
        this.blockHashCode = calculateHash();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public void setTransaction(String[] transaction) {
        this.transactions = transaction;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getHashCode() {
        return blockHashCode;
    }

    public void setHashCode(int hashCode) {
        this.blockHashCode = hashCode;
    }

    public int getPreviousHashCode() {
        return previousBlockHashCode;
    }

    public void setPreviousHashCode(int previousHashCode) {
        this.previousBlockHashCode = previousHashCode;
    }

    @Override
    public String toString() {
        return "blockchain.Block{ " +
                "transactions = " + Arrays.toString(transactions) +
                ", blockHashCode = " + blockHashCode +
                ", previousBlockHashCode = " + previousBlockHashCode +
                " }";
    }

    public int calculateHash(){
        int hashedTimestamp = Arrays.hashCode(new String[] {this.timestamp});
        int hashedTransactions = Arrays.hashCode(this.transactions);
        return Arrays.hashCode( new int[] {this.index, hashedTransactions, hashedTimestamp, this.previousBlockHashCode});
    }
}
