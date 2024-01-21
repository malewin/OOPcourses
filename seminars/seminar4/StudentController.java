package seminar4;

public class StudentController implements UserController<Student> {

    @Override
    public Student addUser(String secondName, String firstName, String lastName) {
        return new Student(1, secondName, firstName, lastName);
    }
}