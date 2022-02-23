package ch13;



import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("길동쓰");
        set.add("감찬쓰");
        set.add("권율쓰");

        System.out.println(set);




        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member = new Member(2,"순신");
        Member member2 = new Member(3,"순신");

        memberTreeSet.addMember(member);
        memberTreeSet.addMember(member2);
        memberTreeSet.showAllMember();

    }
}
