package seminars.seminar2.task1;

public class Human extends Actor{

    String gender;
    int age;

    @Override
    public String toString(){
        return "{" + "name=" + name +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder + 
                ", gender=" + gender+ 
                ", age=" + age + "}";

    }


    public Human(String name){
        super(name);
    }

    @Override
    public void setAll(String name, boolean isMakeOrder, boolean isTakeOrder){
        this.name = name; this.isMakeOrder = isMakeOrder; this.isTakeOrder = isTakeOrder;
    }
    public void setAll(String name, boolean isMakeOrder, boolean isTakeOrder, String gender, int age){
        this.name = name; this.isMakeOrder = isMakeOrder; this.isTakeOrder = isTakeOrder;
        this.gender = gender; this.age = age;
    }

    @Override
    String getName() {
        return name;
    }

    
    // public void setMakeOrder(boolean make){
    //     isMakeOrder = make;
    // }
    
    // public void setTakeOrder(boolean isTakeOrder){
    //     this.isTakeOrder = isTakeOrder;
    // }
    
    // public boolean isMakeOrder(){
    //     return isMakeOrder;
    // }
    
    // public boolean isTakeOrder(){
    //     return isTakeOrder;
    // }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
}