package experiments.domainsOOP;

import java.util.*;

public class Minter implements Mint, SendMsg {
    Queue <NFT> mintedCollection = new ArrayDeque<>();
    Queue <String> minters = new ArrayDeque<>();
    @Override
    public void toMint(NFT nft, Wallet wallet) {
        if (wallet.getBalance() > nft.getPriceMint()){
            nft.addrMinter = wallet.getWalletAddress();
            mintedCollection.add(nft);
            minters.add(wallet.getWalletAddress());
            wallet.setBalance(wallet.getBalance() - nft.getPriceMint());
            System.out.println("\u001B[35m" + "NFT " + nft.getName() + " создана за "+ nft.getPriceMint() + "\u001B[0m");
        }
    }

    @Override
    public void  sendNFT(NFT nft, Wallet wallet){};
    public void sentMessage(Wallet wallet) {
        if (mintedCollection.size() != 0 && mintedCollection.peek().getAddrMinter().equals(wallet.getWalletAddress())){
            wallet.wallet.add(mintedCollection.poll());
            System.out.println("\u001B[35m" + "NFT" + " отправлена кошельку " + wallet.getWalletAddress() + "\u001B[0m");
        }
    }
}
