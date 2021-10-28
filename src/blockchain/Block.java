package blockchain;

import java.util.Arrays;

public class Block {
    private String[] transactions;
    private int blockHashCode;
    private int previousBlockHashCode;

    public Block(String[] transaction, int previousHashCode) {
        this.transactions = transaction;
        this.previousBlockHashCode = previousHashCode;
        this.blockHashCode = Arrays.hashCode( new int[] {Arrays.hashCode(this.transactions), this.previousBlockHashCode});
    }

    public String[] getTransaction() {
        return transactions;
    }

    public void setTransaction(String[] transaction) {
        this.transactions = transaction;
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
}
