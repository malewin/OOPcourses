package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void removeByFIO (String firstName, String secondName, String lastName) {
        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.firstName.equals(firstName)
                    && student.secondName.equals(secondName)
                    && student.lastName.equals(lastName))
                iterator.remove();
        }
    }

    public List<Student> sortedByID() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> sortedByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        studentList.sort(new StudentComparator());
        return studentList;
    }
}