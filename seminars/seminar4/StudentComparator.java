package seminar4;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getSecondName().compareTo(o2.getSecondName());
        if (result == 0) {
            result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return result;
            }
        } else {
            return result;
        }
    }
}