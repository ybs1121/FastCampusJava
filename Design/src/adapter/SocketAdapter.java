package adapter;

public class SocketAdapter implements Electron110V{

    private  Electron2200V electron2200V;


    public SocketAdapter(Electron2200V electron2200V){
        this.electron2200V = electron2200V;
    }

    @Override
    public void powerOn() {
        electron2200V.connect();

    }
}
