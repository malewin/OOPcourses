package seminars.seminar2.task1;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    List<Actor> queue = new ArrayList<>();


    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrders(){
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()){
                System.out.println(actor.getName() + " сделал заказ");
                actor.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders(){
            for (Actor actor : queue) {
            if (!actor.isTakeOrder() && actor.isMakeOrder()){
                System.out.println(actor.getName() + " забрал заказ");
                actor.setTakeOrder(true);
            } 
            }
        }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseFromQueue = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder){
                System.out.println(actor.getName() + " вышел из очереди");
                releaseFromQueue.add(actor);
            }
        }
        releaseFromMarket(releaseFromQueue);
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " заходит в Магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    
}
