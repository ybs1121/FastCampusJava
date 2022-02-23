package ch12;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class MemberHashSet {
    private HashSet<Member> hashSet;



    public MemberHashSet() {
        hashSet = new HashSet<>();
    }
    public MemberHashSet(int size) {
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
//        for(int i = 0 ; i<arrayList.size(); i++){
//            Member member = arrayList.get(i);
//            if(member.getMemberId() == memberId){
//                arrayList.remove(i);
//                return true;
//            }
//            System.out.println("Not valid Id");

        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println("존재하지 않는 ID");
        return false;

    }

    public void showAllMember(){
        for(Member i:hashSet){
            System.out.println(i);
        }
    }


}
