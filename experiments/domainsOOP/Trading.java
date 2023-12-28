package experiments.domainsOOP;

public interface Trading {
    abstract void buy(NFT nft, Wallet wallet, double price);
    abstract void sell(NFT nft, Wallet wallet, double price);
}
