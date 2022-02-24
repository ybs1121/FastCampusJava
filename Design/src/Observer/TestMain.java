package Observer;

public class TestMain {
    public static void main(String[] args) {
        Button button = new Button("버튼");


        button.addListener(new IButtonLisnter() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });


        button.click("메세지 전달 click 2");
        button.click("메세지 전달 click 2");
        button.click("메세지 전달 click 2");
    }
}
