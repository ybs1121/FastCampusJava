package ch10;

public class BirthdayTest {
    public static void main(String[] args) {
        Birthday date = new Birthday();
        date.setYear(2016);
        date.setMonth(12);
        date.setDay(21);
        date.showDate();
        //맴버 변수들을 private로 막고 getter setter을 이용하는 이유: 맴버변수들의 무분별한 변화를 막기 위해
        // ex) 월은 1~12월까지 존재하는데 private으로 막지 않으면 직접적으로 설정해 100 200등 값을 넣을 수 있다.
        // 하지만 private 맴버변수를 선언하고 setter을 통해 값을 설정할 경우 조건문을 넣어 이상한 값이 들어가는 것을 방지한다.
    }
}
