package seminar5.service;

import seminar5.model.Student;
import seminar5.model.Teacher;
import seminar5.model.Type;
import seminar5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> usersList = new ArrayList<>();

    public void create (Type type, String secondName, String firstName, String lastName) {
        User user = null;
        int id = getLastId(type);
        if (Type.STUDENT == type) {
            user = new Student(id , secondName, firstName, lastName);
        }
        if (Type.TEACHER == type) {
            user = new Teacher(id , secondName, firstName, lastName);
        }
        usersList.add(user);
    }

    private int getLastId(Type type) {
        boolean isStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user: usersList) {
            if (user instanceof Student && isStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
            if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getUsersList() {
        return usersList;
    }
}
