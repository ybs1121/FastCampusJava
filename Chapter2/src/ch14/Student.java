package ch14;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(){
        this("Noname",0);
    }

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.grade = grade;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaix(Taxi taix){
        taix.take(10000);
        this.money -= 10000;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getmoney() {
        return money;
    }

    public void setmoney(int money) {
        this.money = money;
    }

    public void showInfo(){
        System.out.println(studentName + "남은 돈은 " + money + "원 입니다.");
    }
}
