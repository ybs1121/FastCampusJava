package ch06;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();

        ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();

        threeDPrinter3.setMaterial(powder);

        Powder powder1 = (Powder) threeDPrinter3.getMaterial();


        GenericPrinter<Powder> genericPrinter = new GenericPrinter();
        genericPrinter.setMeterial(powder);
        powder1 = genericPrinter.getMeterial();

        System.out.println(powder1.toString());
    }
}
