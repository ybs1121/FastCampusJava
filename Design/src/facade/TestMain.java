package facade;

public class TestMain {

    public static void main(String[] args) {
       SftpClient sftpClient = new SftpClient("www.foo.com",22,"/home/etc","temp.tmp");
       sftpClient.connect();
       sftpClient.write();
       sftpClient.read();
       sftpClient.disConnect();

    }
}
