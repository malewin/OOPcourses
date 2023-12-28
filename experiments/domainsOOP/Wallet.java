package experiments.domainsOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Wallet implements SendMsg{
    public List<NFT> wallet = new ArrayList<>();
    protected String walletAddress;
    double balance;

    public Wallet(String walletAddress, double balance){
        this.walletAddress = walletAddress;
        this.balance = balance;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void toAdd(NFT nft){
        wallet.add(nft);
    }

    public void toDelete(NFT nft){
        wallet.remove(nft);
    }

    public void showWallet(){
        System.out.println("\u001B[32m" + "WalletAddress: " + walletAddress + "\u001B[0m");
        NFT.showList(wallet);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void sentMessage(NFT nft, Wallet address) {
        wallet.remove(nft);
        address.wallet.add(nft);
        System.out.println("\u001B[35m" + walletAddress + " отправил " + address.getWalletAddress() + " 1 НФТ"+ nft.getName() + "\u001B[0m");
    }

    public void recieveMessage(NFT nft){
        wallet.add(nft);
    }
}
