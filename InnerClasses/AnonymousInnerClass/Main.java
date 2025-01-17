public class Main {

    public static void main(String[] args){

        Animal myanimal = new Animal();
        myanimal.makeNoise();

        //extending the Animal class without even creating a class file and naming a subclass , that's anonymous classes
        Animal bigfoot = new Animal(){

            @Override
            public void makeNoise() {
                System.out.println("rooaaaaaaaarrrrrrrr");
            }
        };

        bigfoot.makeNoise();


        //implementing the runnable interface without even creating a separate class that implements it and directly overriding its methods , that's anonymous class
        Runnable myrunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am runnnnninnngggg");
            }
        };

        myrunnable.run();
    }
}