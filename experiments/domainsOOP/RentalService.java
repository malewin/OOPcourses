package experiments.domainsOOP;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class RentalService extends MarketPlace implements RentalInterface{

    List<NFT> amountedRented = new ArrayList<>(); // список классов-слепков где будет проверяться статус истекшего в аренеде домена
    // Time starRentTime = new Time(0, 0, 0); в доп классе-слепке заминченого нфт будем менять статус
    // Time endRendTime = new Time(0, 0, 0);

    public RentalService(String name, double balance, String marketAddress) {
        super(name, balance, marketAddress);
    }
    
    @Override
    public void toRentDomain(Domain domain, Wallet wallet, double taxPrice, long rentTime){
        DublikatDomain dublikatDomain1 = new DublikatDomain(4, domain.getName(), 1, "NFT", 0, 0, true, rentTime, taxPrice);
        double price = taxPrice * ((double) rentTime/10000);
        if(wallet.getBalance() > price && storer.contains(domain)){
            domain.walletAddress = wallet.getWalletAddress();
            dublikatDomain1.setWalletAddress(domain.walletAddress);
            wallet.wallet.add(dublikatDomain1);
            dublikatDomain1.end();
            amountedRented.add(dublikatDomain1);
            wallet.setBalance(wallet.getBalance() - price );
            balance = balance + price;
            System.out.println("Домен " + dublikatDomain1.getName() + " сдан в аренду кошельку " + wallet.getWalletAddress() + " за " + price + " на срок " + rentTime/1000 + " секунд.");

        }
    }

    @Override
    public void takeDomain(Domain domain, DublikatDomain dublikatDomain, Wallet wallet) {
        if (wallet.wallet.contains(dublikatDomain) && dublikatDomain.status == false){
            domain.walletAddress = null;
            wallet.wallet.remove(dublikatDomain);
            amountedRented.remove(dublikatDomain);
            System.out.println("Поле домена очищено, копия домена "+ domain.getName()+" удалена");
        }
    }

}
