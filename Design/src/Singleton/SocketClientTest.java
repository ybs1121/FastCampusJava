package Singleton;

public class SocketClientTest {
    private SocketClient socketClient;

    public SocketClientTest(){
        this.socketClient = SocketClient.getInstance();
    }

    public  SocketClient getSocketClient(){
        return this.socketClient;
    }
}
