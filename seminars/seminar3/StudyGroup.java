package seminars.seminar3;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup extends Student{

    
    
    
    static List<Student> studyGroup = new ArrayList<>();
    protected static int amountOfParticipians;
    protected static String groupName;
    
    public StudyGroup(String name, String sourName, int amountOfParticipians, String groupName) {
        super(name, sourName);
        this.amountOfParticipians = amountOfParticipians;
        this.groupName = groupName;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public String getGroupName(){
        return groupName;
    }

    public int getAmountOfStudents(){
        return amountOfParticipians;
    }

    public void addingToGroup(String name, String sourName){
        Student student1 = new Student(name, sourName){};
        studyGroup.add(student1);
        amountOfParticipians ++;
        System.out.println(student1 + " добавлен в группу");
    }

    public static void deleteFromGroup(Student student1){
        for (Student student : studyGroup) {
            if (student.getName().equals(student1)){
                studyGroup.remove(student);
                amountOfParticipians --;
            }
            System.out.println(student + " исключен из группы");
        }
    }

    public void showParticipants(){
        System.out.println("Участники группы: " + studyGroup);
    }

}
