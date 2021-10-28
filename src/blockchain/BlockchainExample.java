package blockchain;

import java.util.ArrayList;

public class BlockchainExample {

    public static void main(String[] args) {

            ArrayList<Block> blockchain = new ArrayList<Block>();

            String[] firstTransaction = {"Bob added 300$"};
            Block firstBlock = new Block(firstTransaction, 0);
            blockchain.add(firstBlock);
            System.out.println("First block: " + firstBlock.toString());
            // -9277594

            String[] secondTransaction = {"Bob added 300$", "Alice added 450$"};
            Block secondBlock = new Block(secondTransaction, firstBlock.getHashCode());
            blockchain.add(secondBlock);
            System.out.println("Second block: " + secondBlock.toString());
            // 2014054829

            String[] thirdTransaction = {"Bob added 300$", "Alice added 450$", "Bob bought 150$ worth of Bitcoin"};
            Block thirdBlock = new Block(thirdTransaction, secondBlock.getHashCode());
            blockchain.add(thirdBlock);
            System.out.println("Third block: " + thirdBlock.toString());
            // 2111063171

    }
}
