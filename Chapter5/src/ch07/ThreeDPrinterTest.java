package ch07;

import ch06.GenericPrinter;
import ch06.Powder;
import ch06.ThreeDPrinter3;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ch06.Powder powder = new ch06.Powder();

        ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();

        threeDPrinter3.setMaterial(powder);

        ch06.Powder powder1 = (ch06.Powder) threeDPrinter3.getMaterial();


        ch06.GenericPrinter<Powder> genericPrinter = new GenericPrinter();
        genericPrinter.setMeterial(powder);
        powder1 = genericPrinter.getMeterial();

        System.out.println(powder1.toString());
    }
}
