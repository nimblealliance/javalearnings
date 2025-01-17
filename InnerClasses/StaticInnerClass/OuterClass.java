public class OuterClass {

    int num = 6;

    public void heyThere(){
        System.out.println("Hey there!!!");
    }


    public static class InnerClass{

        static int number = 8;

        public void whatsUp(){
            System.out.println("Hey there from inner class");
        }

        public static void whatsUpStatic(){
            System.out.println("Hey there from inner class's static method");
        }
    }

}
