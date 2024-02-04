package seminar5.model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> studentsList;


    public StudyGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                '}';
    }
}