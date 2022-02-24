package proxy;

public class TestMain {
    public static void main(String[] args) {
        BrowserClazz browser = new BrowserClazz("www.naver.com");
        browser.show();


        Browser browser1 = new BrowserProxy("WWW.NAVER.COM");
        browser1.show();
        browser1.show();
    }
}
