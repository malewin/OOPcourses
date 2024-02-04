package seminar6.presenter;

import seminar6.model.Teacher;
import seminar6.model.User;
import seminar6.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class TeacherControllerImpl implements TeacherController {
    private List<Teacher> teachersList = new ArrayList<>();
    private TeacherView teacherView;

    public TeacherControllerImpl(TeacherView teacherView) {
        this.teacherView = teacherView;
    }

    @Override
    public void addTeacher(String secondName, String firstName, String lastName) {
        Teacher newTeacher = new Teacher(secondName, firstName, lastName);
        teachersList.add(newTeacher);
    }

    @Override
    public void showTeachers() {
        teacherView.showTeachers(teachersList);
    }

    @Override
    public void editTeacher(int teacherId, String secondName, String firstName, String lastName) {
        for (Teacher teacher : teachersList) {
            if (teacher.getTeacherId() == teacherId) {
                teacher.setSecondName(secondName);
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                break;
            }
        }
    }

    public static interface UserController<T extends User> {
        T createUser(String secondName, String firstName, String lastName);
    }
}