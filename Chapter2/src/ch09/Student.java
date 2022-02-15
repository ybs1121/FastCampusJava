package ch09;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
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

    public Subject getKorea() {
        return korea;
    }

    public void setKorea(String name,int score) {
        korea.score = score;
        korea.subjectName = name;
    }

    public Subject getMath() {
        return math;
    }

    public void setMath(String name,int score) {
        math.score = score;
        math.subjectName = name;
    }

    public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(studentName + "총점은 " + total);
    }

}
