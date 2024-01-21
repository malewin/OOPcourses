package seminar3;

import seminar3.HW.Stream;
import seminar3.HW.StreamIterator;
import seminar3.HW.StreamService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(student1);
        StudentGroup studentGroup1 = new StudentGroup(studentList1);

        List<Student> studentList2 = new ArrayList<>();

        studentList2.add(student2);
        studentList2.add(student3);
        studentList2.add(student4);
        StudentGroup studentGroup2 = new StudentGroup(studentList2);

        List<StudentGroup> groupsList = new ArrayList<>();
        groupsList.add(studentGroup1);
        groupsList.add(studentGroup2);

        Stream stream = new Stream(groupsList);
        Stream stream0 = new Stream(new ArrayList<>());

        List<Stream> streams = new ArrayList<>();
        streams.add(stream);
        streams.add(stream0);

        StreamService streamService = new StreamService(streams);
        for (Stream item: streams) {
            System.out.println(item);
        }

        System.out.println();

        List<Stream> sortedStreams = streamService.sortBySize();
        for (Stream item: sortedStreams) {
            System.out.println(item);
        }

        StreamIterator streamIterator = new StreamIterator(stream);
        while (streamIterator.hasNext()) {
            System.out.println(streamIterator.next());
        }

        System.out.println();

        for (StudentGroup group: stream) {
            System.out.println(group);
        }




//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.firstName.equals("aab"))
//                iterator.remove();
//            else
//                System.out.println(student);
//        }

//        StudentGroupService service = new StudentGroupService(studentGroup);
////        service.removeByFIO("aaa", "aaa", "aaa");
//
//        List<Student> sortedStudents = service.sortedByID();
//        for (Student student: sortedStudents) {
//            System.out.println(student);
//        }
//        System.out.println();
//        sortedStudents = service.sortedByFIO();
//        for (Student student: sortedStudents) {
//            System.out.println(student);
//        }


    }
}
