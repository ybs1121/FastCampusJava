package Strategy;

public class TestMain {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        //base64
        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NomalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64result = encoder.getMessage(message);
        System.out.println(base64result);

    }
}
