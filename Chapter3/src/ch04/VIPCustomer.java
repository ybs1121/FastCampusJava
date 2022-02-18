package ch04;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;



    VIPCustomer(){

        salesRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";

        System.out.println("VIP");
    }


    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        price -= (int)(price*salesRatio);
        return price;
    }


}
