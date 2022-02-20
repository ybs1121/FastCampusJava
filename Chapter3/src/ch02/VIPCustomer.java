package ch02;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    VIPCustomer(){

        salesRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";

        System.out.println("VIP");
    }

    public void test(){
        System.out.println("VIPcustomer");

    }

    public void test2(){
        System.out.println("VIPcustomer2");

    }

}
