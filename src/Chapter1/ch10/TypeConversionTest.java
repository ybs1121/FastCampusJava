package Chapter1.ch10;

public class TypeConversionTest {
    public static void main(String[] args) {
        byte bnum = 125;
        int inum = bnum;
        System.out.println(inum);
        bnum = (byte) inum;

    }
}
