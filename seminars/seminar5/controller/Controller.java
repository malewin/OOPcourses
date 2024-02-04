package seminar5.controller;

import seminar5.model.*;
import seminar5.service.DataService;
import seminar5.service.StudyGroupService;
import seminar5.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    DataService service = new DataService();
    StudyGroupService studyGroupService = new StudyGroupService();
    StudentView studentView = new StudentView();

    public void createStudent (String secondName, String firstName, String lastName) {
        service.create(Type.STUDENT, secondName, firstName, lastName);
    }

    public void createTeacher (String secondName, String firstName, String lastName) {
        service.create(Type.TEACHER, secondName, firstName, lastName);
    }

    public StudyGroup createStudyGroup (int teacherId, int... studentIds) {
        Teacher teacher = getTeacherById(teacherId);
        List<Student> studentsList = getStudentsByIds(studentIds);
        return studyGroupService.createStudyGroup(teacher, studentsList);
    }

    private Teacher getTeacherById(int teacherId) {
        for (User user: service.getUsersList()) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == teacherId)
                return (Teacher) user;
        }
        return null;
    }

    private List<Student> getStudentsByIds (int... studentIds) {
        List<Student> studentsListGroup = new ArrayList<>();
        for (int id: studentIds) {
            Student student = getStudentById(id);
            if (student != null) {
                studentsListGroup.add(student);
            }
        }
        return studentsListGroup;
    }

    private Student getStudentById (int studentId){
        for (Student student: getStudentsList()) {
            if (student.getStudentId() == studentId)
                return student;
        }
        return null;
    }

    public List<Student> getStudentsList () {
        List<Student> studentsList = new ArrayList<>();

        for (User user: service.getUsersList()) {
            if (user instanceof Student)
                studentsList.add((Student) user);
        }
        return studentsList;
    }

    public void printStudentsList (List<Student> studentsList) {
        for (Student student: studentsList) {
            studentView.printStudent(student);
        }
    }

    public void printStudyGroup (StudyGroup studyGroup) {
        System.out.println(studyGroup);
    }
}
