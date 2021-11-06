package blockchain;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BasicBlockchainExample {

    public static void main(String[] args) {

            ArrayList<Block> blockchain = new ArrayList<Block>();

            String[] firstTransaction = {"Bob added 300$"};
            Block firstBlock = new Block(0, firstTransaction, "23/10/2021", 0);
            blockchain.add(firstBlock);
            System.out.println("First block: " + firstBlock.toString());
            // -9277594

            String[] secondTransaction = {"Bob added 300$", "Alice added 450$"};
            Block secondBlock = new Block(1, secondTransaction, "25/10/2021", firstBlock.getHashCode());
            blockchain.add(secondBlock);
            System.out.println("Second block: " + secondBlock.toString());
            // 2014054829

            String[] thirdTransaction = {"Bob added 300$", "Alice added 450$", "Bob bought 150$ worth of Bitcoin"};
            Block thirdBlock = new Block(2, thirdTransaction, "29/10/2021", secondBlock.getHashCode());
            blockchain.add(thirdBlock);
            System.out.println("Third block: " + thirdBlock.toString());
            // 2111063171

            Scanner keyboard = new Scanner(System.in);
            String[] words = keyboard.nextLine().split(" ");
            //String[] words = input.split(" ");
            String word1 = words[0].toUpperCase();
            String word2 = words[1].toLowerCase();
            String word3 = words[2].substring(0,2);
            System.out.println(word1 + " " + word2 + " " + word3);

    }
}
