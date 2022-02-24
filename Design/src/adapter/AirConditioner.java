package adapter;

public class AirConditioner implements Electron2200V{
    @Override
    public void connect() {
        System.out.println("에어컨 220v");
    }
}
