package ch12;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member = new Member(2,"순신");
        Member member2 = new Member(3,"순신");

        memberHashSet.addMember(member);
        memberHashSet.addMember(member2);
        //memberHashSet.showAllMember();


        Member member3 = new Member(3,"순신");
        memberHashSet.addMember(member3);
        memberHashSet.showAllMember();
    }
}
