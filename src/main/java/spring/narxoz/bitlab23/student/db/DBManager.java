package spring.narxoz.bitlab23.student.db;

import spring.narxoz.bitlab23.student.db.models.Student;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> students = new ArrayList<>();
    private static Long id = 7L;

    static {
        students.add(new Student(1L, "Elon", "Musk", 88, "B"));
        students.add(new Student(2L, "John", "Snow", 91, "A"));
        students.add(new Student(3L, "Harry", "Potter", 48, "F"));
        students.add(new Student(4L, "Sirius", "Blake", 65, "C"));
        students.add(new Student(5L, "Barak", "Obama", 82, "B"));
        students.add(new Student(6L, "Jack", "Charlie", 52, "D"));
    }

    public static void addStudent(Student student) {
        if (student.getExam() >= 90) {
            student.setMark("A");
        } else if (student.getExam() >= 75) {
            student.setMark("B");
        } else if (student.getExam() >= 60) {
            student.setMark("C");
        } else if (student.getExam() >= 50) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }
        student.setId(id);
        students.add(student);
        id++;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}
