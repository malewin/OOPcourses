package experiments.domainsOOP;

import java.util.*;

public class MarketPlace implements Trading{
    Set<NFT> storer = new HashSet<>();
    String name;
    double balance;
    int amountOfNFT;
    String marketAddress;

    public MarketPlace(String name, double balance, String marketAddress){
        super();
        this.name = name; this.balance = balance; this.marketAddress = marketAddress;
    }

    public void tooString(){
        System.out.println("{" +
                            "name=" + name +
                            ", balance=" + balance +
                            ", amountOfNFT=" + amountOfNFT +
                            ", marketAddress=" + marketAddress +
                            "}");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAmountOfNFT() {
        return storer.size();
    }

    public void setAmountOfNFT(int amountOfNFT) {
        this.amountOfNFT = amountOfNFT;
    }

    public String getMarketAddress() {
        return marketAddress;
    }

    public void setMarketAddress(String marketAddress) {
        this.marketAddress = marketAddress;
    }

    @Override
    public void buy(NFT nft, Wallet wallet, double price) {
        if (wallet.wallet.contains(nft) && balance > price){
            wallet.wallet.remove(nft);
            wallet.setBalance(wallet.balance + price);
            storer.add(nft);
            balance = balance - price;
            System.out.println("\u001B[35m" + "Магазин " + name + " купил 1 НФТ " + nft.getName() +" у кошелька " + wallet.getWalletAddress() + " за " + price + "\u001B[0m");
        }

    }

    @Override
    public void sell(NFT nft, Wallet wallet, double price) {
        if (storer.contains(nft) && wallet.getBalance() > price){
            wallet.wallet.add(nft);
            storer.remove(nft);
            wallet.balance -=price;
            balance +=price;

        }

    }
}
