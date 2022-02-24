package aop;

import proxy.Browser;

import java.util.concurrent.atomic.AtomicLong;

public class TestMain {
    public static void main(String[] args) {
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();


        Browser browser = new AopBrowser("www.naver.com",()->{
            System.out.println("before");
            start.set(System.currentTimeMillis());
        },()->{
            long now = System.currentTimeMillis();
            end.set(now - start.get());
        });
        browser.show();
        System.out.println(end.get());

    }
}
