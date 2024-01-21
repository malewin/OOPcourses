package seminar4;

public class Student extends User implements Comparable<Student> {
    int studentId;

    public Student(int studentId, String secondName, String firstName, String lastName) {
        super(secondName, firstName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (studentId > o.studentId)
            return 1;
        if (studentId < o.studentId)
            return -1;
        return 0;
    }
}