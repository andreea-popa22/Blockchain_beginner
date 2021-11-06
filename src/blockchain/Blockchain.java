package blockchain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Blockchain {
    private List<Block> chain;

    public Blockchain(Block[] chain) {
        this.chain = new ArrayList<Block>(Arrays.asList(createGenesisBlock()));
    }

    public List<Block> getChain() {
        return chain;
    }

    public void setChain(List<Block> chain) {
        this.chain = chain;
    }

    @Override
    public String toString() {
        return "Blockchain{" +
                "chain=" + chain.toString() +
                '}';
    }

    public Block createGenesisBlock(){
        String[] empty = new String[0];
        return new Block(0, empty, "01/01/2010", 0);
    }

    public Block getLatestBlock(){
        return this.chain.get(this.chain.size() - 1);
    }

    public void addBlock(Block newBlock){
        newBlock.setPreviousHashCode(this.getLatestBlock().getHashCode());
        newBlock.setHashCode(newBlock.calculateHash());
        this.chain.add(newBlock);
    }
}
