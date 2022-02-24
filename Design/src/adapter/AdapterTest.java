package adapter;

public class AdapterTest {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        Electron110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

    }

    public static void connect(Electron110V electron110V){
        electron110V.powerOn();
    }
}
