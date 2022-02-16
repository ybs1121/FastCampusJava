package ch24;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;
    ArrayList<Subject> subjectList = new ArrayList<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void addSubject(String subjectName,int score){
        Subject subject = new Subject(subjectName,score);
        subjectList.add(subject);

    }

    public void showStudentInfo(){
        int i;
        int total = 0;
        for(i=0;i<subjectList.size();i++){
            System.out.println("학생 " +studentName +"의 " + subjectList.get(i).getSubject() + " 과목의 성적은 " +
                    subjectList.get(i).getScore() + "입니다.");
            total+=subjectList.get(i).getScore();
        }
        System.out.println("총점:  "+ total);

    }
}
