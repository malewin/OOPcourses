package experiments.domainsOOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Domain domain1 = new Domain(1, "author.ton", 1, "domain", 196,0);
        Domain domain2 = new Domain(2, "song.ton", 1, "domain", 290,0);
        Domain domain3 = new Domain(3, "subscriber.ton", 1, "domain", 90,0);
        Wallet wallet1 = new Wallet("13579", 2000);
        Wallet wallet2 = new Wallet("24680", 1000);
        MarketPlace marketPlace1 = new MarketPlace("getgems.io", 5000, "77777" );
        Minter minter = new Minter();
        minter.toMint(domain1, wallet1);
        minter.sentMessage(wallet1);
        wallet1.showWallet();
        minter.toMint(domain2, wallet2);
        minter.sentMessage(wallet2);
        minter.toMint(domain3, wallet2);
        minter.sentMessage(wallet2);
        wallet2.showWallet();
        wallet2.sentMessage(domain3, wallet1);
        wallet1.showWallet();
        wallet2.showWallet();
        System.out.println(marketPlace1.getBalance());
        marketPlace1.buy(domain1, wallet1, 800);
        System.out.println(marketPlace1.getBalance());
        wallet1.showWallet();
        marketPlace1.tooString();
        marketPlace1.buy(domain2, wallet2, 2200);
        marketPlace1.tooString();

        }
    }
