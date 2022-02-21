package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(100,"Lee");
        Student student2 = new Student(100,"Lee");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        Student copy = (Student)student1.clone();
    }
}
