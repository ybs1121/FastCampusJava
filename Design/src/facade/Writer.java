package facade;

public class Writer {
    private String filename;

    public Writer(String filename) {
        this.filename = filename;
    }

    public void fileConnect(){
        String msg = String.format("Writer File %s 연결", filename);
        System.out.println(msg);
    }
    public void write(){
        String msg = String.format("Writer File %s 작성", filename);
        System.out.println(msg);
    }
    public void fileDisconnect(){
        String msg = String.format("Writer File %s 연결해제", filename);
        System.out.println(msg);
    }
}
