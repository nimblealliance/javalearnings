public class Main {

    public static void main(String[] args) {

        Button button = new Button("Submit");
        Button.EventHandler handler = button.new EventHandler();
        handler.click();
        System.out.println();


        MyCollection collection = new MyCollection();
        MyCollection.Iterator iterator = collection.new Iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
