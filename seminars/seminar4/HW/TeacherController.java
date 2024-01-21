package seminar4.HW;

import java.util.ArrayList;
import java.util.List;

import seminar4.UserController;

public class TeacherController implements UserController<Teacher> {
    private List<Teacher> teacherList = new ArrayList<>();

    public List<Teacher> getTeachersList(){
        return teacherList;
    }

    @Override
    public Teacher addUser(String secondName, String firstName, String lastName) {
        Teacher newTeacher = new Teacher(secondName, firstName, lastName);
        teacherList.add(newTeacher);
        return newTeacher;
    }

    public void editTeacherById (int teacherid, String secondName, String firstName, String lastName) {
        for (Teacher teacher : teacherList) {
            if (teacher.teacherId == teacherid){
                teacher.setSecondName(secondName);
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                break;
            }
        }
    }

}