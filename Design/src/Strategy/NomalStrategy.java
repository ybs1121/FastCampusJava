package Strategy;

public class NomalStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
