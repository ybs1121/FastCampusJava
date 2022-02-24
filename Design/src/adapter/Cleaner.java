package adapter;

public class Cleaner implements Electron2200V{
    @Override
    public void connect() {
        System.out.println("청소기 220v");
    }
}
