package ch15;

public class Customer implements Buy,Sell{
    @Override
    public void buy() {
        System.out.println("Customer buy");

    }


    @Override
    public void sell() {
        System.out.println("Customer sell");

    }

    @Override
    public void order() {
        Sell.super.order();
    }

    public void hello(){
        System.out.println("hello");
    }

}
