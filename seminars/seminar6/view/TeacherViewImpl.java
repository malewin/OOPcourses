package seminar6.view;

import seminar6.model.Teacher;

import java.util.List;

public class TeacherViewImpl implements TeacherView {
    @Override
    public void showTeachers(List<Teacher> teachersList) {
        for (Teacher teacher: teachersList) {
            System.out.println(teacher);
        }
    }
}
