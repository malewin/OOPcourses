package seminar6.presenter;

import seminar4.User;

public interface TeacherController {
    void addTeacher(String secondName, String firstName, String lastName);
    void showTeachers();
    void editTeacher(int teacherId, String secondName, String firstName, String lastName);

    interface UserController<T extends User> {
        T addUser(String secondName, String firstName, String lastName);
    }
}