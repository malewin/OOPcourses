package experiments.domainsOOP;

import java.sql.Time;
import java.util.List;

public abstract interface RentalInterface {
    public void toRentDomain(Domain domain, Wallet wallet, double taxPrice, long rentTime);
    public void takeDomain(Domain domain, DublikatDomain DublikatDomain, Wallet wallet);
}
