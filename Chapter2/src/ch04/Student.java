package ch04;

public class Student {
    int studentId;
    String studentName;
    String address;


    public Student(){
        this.studentId = 0;
        this.studentName = "studentName";
        this.address = "address";
    }

    public Student(int studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public void showStudentInfo(){
        System.out.println(studentId+" "+ studentName+" "+address);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
