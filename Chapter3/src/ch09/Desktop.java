package ch09;

public class Desktop extends Computer{
    @Override
    public void display(){
        System.out.println("DeskTop display");
    }

    @Override
    public void typing() {
        System.out.println("DesKTop typing");

    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnoff");
    }
}
