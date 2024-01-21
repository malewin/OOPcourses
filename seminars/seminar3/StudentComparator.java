package seminar3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.secondName.compareTo(o2.secondName);
        if (result == 0) {
            result = o1.firstName.compareTo(o2.firstName);
            if (result == 0) {
                return o1.lastName.compareTo(o2.lastName);
            } else {
                return result;
            }
        } else {
            return result;
        }
    }
}