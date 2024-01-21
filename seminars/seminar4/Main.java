package seminar4;

import seminar4.HW.Teacher;
import seminar4.HW.TeacherController;
import seminar4.HW.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(studentController.addUser("Michaylovich", "Viktor", "Tarkhanov"));
        studentsList.add(studentController.addUser("Sharov", "Nikita", "Fatherovich"));

        StudentView printStudents = new StudentView();
        printStudents.sendOnConsole(studentsList);
        System.out.println();

        TeacherController teacherController = new TeacherController();
        teacherController.addUser("Kamenyackiy", "Sergey", "Fatherovich");
        teacherController.addUser("Moiseev", "Kirill", "Fatherovich");

        TeacherView printTeachers = new TeacherView();
        printTeachers.sendOnConsole(teacherController.getTeachersList());
        System.out.println();

        teacherController.editTeacherById(2, "vbn", "ppp", "rty");
        printTeachers.sendOnConsole(teacherController.getTeachersList());
    }
}
