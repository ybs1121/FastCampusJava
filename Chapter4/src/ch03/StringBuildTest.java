package ch03;

public class StringBuildTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        StringBuilder stringBuilder = new StringBuilder(java);
        stringBuilder.append(android);
        String test = stringBuilder.toString();
        System.out.println(test);




    }

}
