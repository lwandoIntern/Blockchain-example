package za.ac.goniwe;

import java.util.Arrays;

public class BlockChainExample {

    public static void main(String[] args) {
        /**
         * Blockchain
         *Block - Hash of previous block + Transaction chained together
         */
        Transaction transaction = new Transaction("Nceba","Sam", 600L);
        Transaction transaction2 = new Transaction("John","King", 500L);
        Transaction transaction3 = new Transaction("Jongikhaya","Nceba", 700L);
        Transaction transaction4 = new Transaction("Senzo","Sam", 10L);
        Block firstBlock = new Block(0, Arrays.asList(transaction,transaction2));
        Block secondBlock = new Block(firstBlock.hashCode(),Arrays.asList(transaction3));
        Block thirdBlock = new Block(secondBlock.hashCode(),Arrays.asList(transaction4));
        System.out.println(thirdBlock.hashCode());

        //-855983419
        //1867083167
    }
}
