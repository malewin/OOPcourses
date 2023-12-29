package experiments.domainsOOP;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Domain domain1 = new Domain(1, "author.ton", 1, "domain", 196,0);
        Domain domain2 = new Domain(2, "song.ton", 1, "domain", 290,0);
        Domain domain3 = new Domain(3, "subscriber.ton", 1, "domain", 90,0);
        Wallet wallet1 = new Wallet("№13579", 2000);
        Wallet wallet2 = new Wallet("№24680", 1000);
        MarketPlace marketPlace1 = new MarketPlace("getgems.io", 5000, "№77777" );
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
        marketPlace1.showMarket();
        marketPlace1.buy(domain1, wallet1, 800);
        wallet1.showWallet();
        marketPlace1.showMarket();
        marketPlace1.buy(domain2, wallet2, 2200);
        marketPlace1.showMarket();
        RentalService rentDNS = new RentalService("rentDNS", 3000, "№66666");
        rentDNS.buy(domain3, wallet1, 600);
        wallet1.showWallet();
        rentDNS.showMarket();
        rentDNS.toRentDomain(domain3, wallet2, 25, 20000);
        wallet2.showWallet();
        System.out.println(domain3.getWalletAddress());
        Thread.sleep(20000);
        System.out.println(((DublikatDomain) rentDNS.amountedRented.getFirst()).getStatus());
        rentDNS.takeDomain(domain3, (DublikatDomain) rentDNS.amountedRented.getFirst(), wallet2);
        rentDNS.showMarket();
        wallet2.showWallet();
        System.out.println(domain3.getWalletAddress());

        rentDNS.toRentDomain(domain3, wallet1, 25, 10000);
        wallet1.showWallet();
        System.out.println(domain3.getWalletAddress());
        Thread.sleep(10000);
        System.out.println(((DublikatDomain) rentDNS.amountedRented.getLast()).getStatus());
        rentDNS.takeDomain(domain3, (DublikatDomain) rentDNS.amountedRented.getFirst(), wallet1);
        rentDNS.showMarket();
        wallet1.showWallet();
        System.out.println(domain3.getWalletAddress());

        }
    }
