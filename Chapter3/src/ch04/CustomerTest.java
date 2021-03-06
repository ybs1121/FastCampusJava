package ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim.showCustomerInfo());

        int price = customerLee.calcPrice(1000);
        System.out.println(price);
        price = customerKim.calcPrice(1000);
        System.out.println(price);

        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerLee.showCustomerInfo());



    }
}
