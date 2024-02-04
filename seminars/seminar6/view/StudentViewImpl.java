package seminar6.view;

import seminar6.model.Student;
import java.util.List;

public class StudentViewImpl implements StudentView {
    @Override
    public void showStudents(List<Student> studentsList) {
        for (Student student: studentsList) {
            System.out.println(student);
        }
    }
}
