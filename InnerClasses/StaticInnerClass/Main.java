public class Main {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.heyThere();
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.whatsUp(); // can only access inner class's non-static method using an object of Inner class
        System.out.println(OuterClass.InnerClass.number);
        OuterClass.InnerClass.whatsUpStatic(); // can only access inner class's static method directly using class name


        System.out.println();
        System.out.println(Config.Database.DB_URL);
        System.out.println(Config.Server.HOST);
        System.out.println(Config.Server.PORT);

//        Config.Server server = new Config.Server();
//        System.out.println(server.PORT);

        System.out.println();
        University uni = new University("Mumbai university","Engineering");
        uni.displayDetails();



    }


}
