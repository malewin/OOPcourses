package seminars.seminar2.task1;

public interface QueueBehaviour {
    public void takeInQueue(Actor actor);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
