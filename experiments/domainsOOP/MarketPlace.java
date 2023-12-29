package experiments.domainsOOP;

import java.util.*;

public class MarketPlace implements Trading{
    Set<NFT> storer = new HashSet<>();
    String name;
    double balance;
    int amountOfNFT;
    String marketAddress;

    public MarketPlace(String name, double balance, String marketAddress){
        this.name = name; this.balance = balance; this.marketAddress = marketAddress;
    }

    public void tooString(){
        System.out.println("\u001B[34m" + "{" +
                            "MarketPlace=" + name +
                            ", balance=" + balance +
                            ", amountOfNFT=" + amountOfNFT +
                            ", marketAddress=" + marketAddress +
                            "}" +  "\u001B[0m");
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
        return amountOfNFT;
    }

    private void setAmountOfNFT() {

        amountOfNFT = storer.size();
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
            setAmountOfNFT();
            System.out.println("\u001B[35m" + "Магазин " + name + " купил НФТ " + nft.getName() +" у кошелька " + wallet.getWalletAddress() + " за " + price + "\u001B[0m");
        }

    }

    @Override
    public void sell(NFT nft, Wallet wallet, double price) {
        if (storer.contains(nft) && wallet.getBalance() > price){
            wallet.wallet.add(nft);
            storer.remove(nft);
            wallet.balance -=price;
            balance +=price;
            setAmountOfNFT();
            System.out.println("\u001B[35m" + "Магазин " + name + " продал НФТ " + nft.getName() +" кошельку " + wallet.getWalletAddress() + " за " + price + "\u001B[0m");

        }

    }
}
