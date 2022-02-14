package Chapter1.ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        int max = (num1 > num2) ? num1:num2;
        System.out.println(max);



    }
}
