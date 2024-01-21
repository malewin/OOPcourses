package seminar4;

public interface UserController<T extends User> {
    T addUser (String secondName, String firstName, String lastName);
}
