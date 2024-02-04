package seminar5;

import seminar5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("sdf", "bnm", "hjk");
        controller.createStudent("iop", "fff", "kkk");
        controller.createTeacher("ppe", "laa", "lhl");
        controller.printStudentsList(controller.getStudentsList());

        System.out.println();

        controller.createStudent("wii", "ggg", "wrt");
        controller.createStudent("cio", "sos", "dad");
        controller.printStudentsList(controller.getStudentsList());

        System.out.println();

        controller.printStudyGroup(controller.createStudyGroup(1, 2, 4));
    }
}
