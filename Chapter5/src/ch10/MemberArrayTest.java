package ch10;

public class MemberArrayTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member = new Member(2,"순신");
        Member member2 = new Member(3,"순신");

        memberArrayList.addMember(member);
        memberArrayList.addMember(member2);
        memberArrayList.showAllMember();

        memberArrayList.removeMember(3);
        memberArrayList.showAllMember();
    }
}
