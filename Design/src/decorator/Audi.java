package decorator;

public class Audi implements ICar{

    private int cost;

    public Audi(int cost) {
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }

    @Override
    public void showPrice() {
        System.out.println("Audi price : " + this.cost);

    }
}
