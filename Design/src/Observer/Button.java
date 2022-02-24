package Observer;

public class Button {
    private String name;
    private IButtonLisnter buttonLisnter;

    public Button(String name) {
        this.name = name;
    }

    public void click(String message){
        buttonLisnter.clickEvent(message);
    }

    public void addListener(IButtonLisnter buttonLisnter){
        this.buttonLisnter = buttonLisnter;
    }
}
