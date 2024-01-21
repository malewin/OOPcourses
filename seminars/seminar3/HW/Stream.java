package seminar3.HW;

//— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;

import seminar3.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    List<StudentGroup> groupsList;

    public Stream(List<StudentGroup> groupsList) {
        this.groupsList = groupsList;
    }

    public List<StudentGroup> getGroupsList() {
        return groupsList;
    }

    public  void addGroup (StudentGroup studentGroup) {
        groupsList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "groupsList=" + groupsList +
                '}';
    }
}
