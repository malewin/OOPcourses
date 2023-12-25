package seminars.seminar3;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupIterator implements Iterator{

    List<Student> selected = new ArrayList<>();
 
    @Override
    public boolean hasNext(){
        return true;
    }
    
    public void hasNext(Student student){
        student.choiced = true;
    }

    @Override
    public void next(){};
    public void next(List<Student> group) {
        for (Student student : group) {
            if (student.getChoiced() == false){
            System.out.println("\u001B[35m" + student + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + student + "\u001B[0m");
        }
        }
    }

    @Override
    public void remove(){};
    public void remove(List<Student> group) {
        for (Student student : group) {
            if (student.getChoiced() == true ) {
                StudyGroup.deleteFromGroup(student);
            }
        }
    }

    
}
