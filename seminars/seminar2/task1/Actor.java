package seminars.seminar2.task1;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected static boolean isMakeOrder;
    protected static boolean isTakeOrder;

    public String toString(){
        return "{" + "name=" + name +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder + "}";

    }
    public Actor(String name){
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }
    public void setAll(String name, boolean isMakeOrder, boolean isTakeOrder){
        this.name = name; this.isMakeOrder = isMakeOrder; this.isTakeOrder = isTakeOrder;
    }

    protected void setName (String name){
        this.name = name;
    }

    protected void setMakeOrder(boolean isMakeOrder){
        this.isMakeOrder = isMakeOrder;
    }

    public void setTakeOrder(boolean isTakeOrder){
        this.isTakeOrder = isTakeOrder;
    }

    public boolean isMakeOrder(){
        return isMakeOrder;
    }

    public boolean isTakeOrder(){
        return isTakeOrder;
    }

    abstract String getName();

}