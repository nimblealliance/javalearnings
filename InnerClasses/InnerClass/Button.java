public class Button {
    private String buttonName;

    public Button(String buttonName) {
        this.buttonName = buttonName;
    }

    public class EventHandler{

        public void click(){
            System.out.println(buttonName+" button clicked!");
        }
    }
}
