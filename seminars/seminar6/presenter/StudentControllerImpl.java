package seminar6.presenter;

import seminar6.model.Student;
import seminar6.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class StudentControllerImpl implements StudentController {
    private List<Student> studentsList = new ArrayList<>();
    private StudentView studentView;

    public StudentControllerImpl(StudentView studentView) {
        this.studentView = studentView;
    }

    @Override
    public void addStudent(String secondName, String firstName, String lastName) {
        Student newStudent = new Student(studentsList.size() + 1, secondName, firstName, lastName);
        studentsList.add(newStudent);
    }

    @Override
    public void showStudents() {
        studentView.showStudents(studentsList);
    }
}