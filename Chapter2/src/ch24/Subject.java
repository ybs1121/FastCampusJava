package ch24;

public class Subject {
    int score;
    String subject;

    public Subject( String subject,int score) {
        this.score = score;
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
