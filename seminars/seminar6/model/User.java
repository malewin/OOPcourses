package seminar6.model;

public abstract class User {
    private String firstName;
    private String lastName;
    private String secondName;

    public User(String secondName, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}