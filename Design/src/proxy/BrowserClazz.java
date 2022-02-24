package proxy;

public class BrowserClazz implements Browser{
    private String url;

    public BrowserClazz(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);
    }
}
