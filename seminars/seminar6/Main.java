package seminar6;

import seminar6.presenter.*;
import seminar6.view.*;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentViewImpl();
        StudentController studentController = new StudentControllerImpl(studentView);

        studentController.addStudent("mikhaikovich", "viktor", "posternak");
        studentController.addStudent("georievna", "maria", "shortiki");
        studentController.showStudents();

        System.out.println();

        TeacherView teacherView = new TeacherViewImpl();
        TeacherController teacherController = new TeacherControllerImpl(teacherView);

        teacherController.addTeacher("ivanovna", "maria", "kruchkonos");
        teacherController.addTeacher("olegovich", "pavel", "molotok");
        teacherController.showTeachers();

        System.out.println();

        teacherController.editTeacher(2, "dmitrievna", "roza", "krasavica");
        teacherController.showTeachers();
    }
}
