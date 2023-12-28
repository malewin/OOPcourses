package experiments.domainsOOP;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("WalletAddress: " + walletAddress);
        System.out.println("NFT: " + wallet);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void sentMessage(NFT nft, Wallet address) {
        wallet.remove(nft);
        address.wallet.add(nft);
        System.out.println(walletAddress + " отправил " + address.getWalletAddress() + " 1 НФТ");
    }

    public void recieveMessage(NFT nft){
        wallet.add(nft);
    }
}
