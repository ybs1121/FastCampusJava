package ch09;

public class ComputerTest {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.display();
        Computer computer = new MyLaptop();
        computer.typing();
    }
}
