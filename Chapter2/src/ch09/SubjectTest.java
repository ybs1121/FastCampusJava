package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"Lee");
        studentLee.setKorea("국어", 100);
        studentLee.setMath("수학",99);
        studentLee.showScoreInfo();

        Student studentKim = new Student(100,"Kim");
        studentKim.setKorea("국어", 79);
        studentKim.setMath("수학",30);
        studentKim.showScoreInfo();
    }
}
