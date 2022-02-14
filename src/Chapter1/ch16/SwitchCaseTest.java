package Chapter1.ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int day = switch(month){
            case 1,3,5,7,8,10,12 ->{
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4,6,9,11 ->{
                yield 30;
            }

            default -> throw new IllegalStateException("Unexpected value: " + month);
        };

        System.out.println(day);
    }
}
