package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(1,"name","seoul");
        student.setStudentId(123);
        student.showStudentInfo();

        Student student2 = new Student();
        student2.showStudentInfo();
    }
}
