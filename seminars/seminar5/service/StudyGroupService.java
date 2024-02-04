package seminar5.service;

import seminar5.model.Student;
import seminar5.model.StudyGroup;
import seminar5.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup (Teacher teacher, List<Student> studentsList) {
        return new StudyGroup(teacher, studentsList);
    }
}
