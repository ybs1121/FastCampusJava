package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;



    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }
    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){
//        for(int i = 0 ; i<arrayList.size(); i++){
//            Member member = arrayList.get(i);
//            if(member.getMemberId() == memberId){
//                arrayList.remove(i);
//                return true;
//            }
//            System.out.println("Not valid Id");

        Iterator<Member> ir = arrayList.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println("존재하지 않는 ID");
        return false;

    }

    public void showAllMember(){
        for(Member i:arrayList){
            System.out.println(i);
        }
    }


}
