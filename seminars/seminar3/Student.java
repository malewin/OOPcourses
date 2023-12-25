package seminars.seminar3;

public abstract class Student {
    String name;
    String sourName;
    static boolean choiced;

    public Student(String name, String sourName){
        this.name = name;
        this.sourName = sourName;
        choiced = false;
    }

    public String toString(){
        return "{" + " name=" + name +
                    ", sourName=" + sourName +
                    "}";
    }

    public String getName(){
        return name;
    }

    public String getSourName(){
        return sourName;
    }

    public boolean getChoiced(){
        return choiced;
    }

}
