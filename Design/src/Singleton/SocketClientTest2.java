package Singleton;

public class SocketClientTest2 {

    private SocketClient socketClient;

    public SocketClientTest2(){
        this.socketClient = SocketClient.getInstance();
    }

    public  SocketClient getSocketClient(){
        return this.socketClient;
    }
}
