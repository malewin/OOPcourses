package seminar5.model;

public class Student extends User {
    private int studentId;

    public Student(int studentId, String secondName, String firstName, String lastName) {
        super(secondName, firstName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}