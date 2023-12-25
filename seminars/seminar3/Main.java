package seminars.seminar3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 =  new Student("Иван", "Смирнов"){};
        Student student2 =  new Student("Ольга", "Скороходько"){};
        Student student3 =  new Student("Жанна", "Аляшева"){};
        Student student4 =  new Student("Мурат", "Абыров"){};
        Student student5 =  new Student("Василий", "Петрухин"){};
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudyGroupIterator iterator = new StudyGroupIterator();
        iterator.next(students);
        iterator.hasNext(student2);
        iterator.next(students);
        iterator.remove(students);
        iterator.next(students);

    }
    
}
