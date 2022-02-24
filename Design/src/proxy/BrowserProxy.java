package proxy;

public class BrowserProxy implements Browser {
    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        if (html == null) {
            this.html = new Html(url);
            System.out.println("BrowserProxy loading");
            return html;
        }
        else {
            System.out.println("BrowserProxy cache");
            return html;}


    }


}
