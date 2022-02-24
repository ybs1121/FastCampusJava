package adapter;

public class HairDryer implements Electron110V{
    @Override
    public void powerOn() {
        System.out.println("헤어드라이 110v");
    }
}
