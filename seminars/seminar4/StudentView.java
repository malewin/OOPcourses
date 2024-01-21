package seminar4;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> studentsList) {
        for (Student student: studentsList) {
            System.out.println(student);
        }
    }
}