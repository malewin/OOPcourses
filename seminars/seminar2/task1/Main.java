package seminars.seminar2.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Виктор");
        Human human2 = new Human("Игорь");
        Human human3 = new Human("Константин");
        Human human4 = new Human("Анна");
        Human human5 = new Human("Виоллета");
        Market market = new Market();
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.update();
        };
    }
    
