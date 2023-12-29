package experiments.domainsOOP;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class DublikatDomain extends Domain{

    
    boolean status = true;
    long rentTime;
    double taxPrice;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run(){
            System.out.println("Время аренды домена истекло!");
            status = false;
        }
    };
    
    public DublikatDomain(int id, String name, int amount, String type, double priceMint, double priceOffer, boolean status, long rentTime, double taxPrice) {
        super(id, name, amount, type, priceMint, priceOffer);
        this.rentTime = rentTime;
        this.taxPrice = taxPrice;
    }

    public void end(){
        timer.schedule(task, rentTime);
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public long getRentTime() {
        return rentTime;
    }

    public void setRentTime(long rentTime) {
        this.rentTime = rentTime;
    }

    public double getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(double taxPrice) {
        this.taxPrice = taxPrice;
    }
}