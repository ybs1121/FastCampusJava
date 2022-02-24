package decorator;

public class TestMain {


    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar a3 = new A3(audi,"A3");
        a3.showPrice();

    }

}
