package ch06;

public class ThreeDPrinter2 {
    private Plastic material;

    public Plastic getMaterial() {
        return material;
    }

    public void setMaterial(Plastic material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "재료는 Plastic";
    }
}
