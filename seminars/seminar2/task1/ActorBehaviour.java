package seminars.seminar2.task1;

public interface ActorBehaviour {
   
    public static void setMakeOrder(boolean isMakeOrder){};

    public static void setTakeOrder(boolean isTakeOrder){};

    public boolean isMakeOrder();

    public boolean isTakeOrder();

    
}
