package seminar4.HW;

import java.util.List;

import seminar4.UserView;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachersList) {
        for (Teacher teacher : teachersList) {
            System.out.println(teacher);

        }
    }
    
}
