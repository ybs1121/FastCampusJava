package ch02;

public class FuntionTest {
    public static int addNum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void sayHello(String greeting){
        System.out.println(greeting);

    }

    public static int calcSum(){
        int sum = 0;

        for(int i = 0; i<=100; i++)
            sum+=i;

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(addNum(1,2));
        sayHello("안녕하세요");
        System.out.println(calcSum());
    }
}
