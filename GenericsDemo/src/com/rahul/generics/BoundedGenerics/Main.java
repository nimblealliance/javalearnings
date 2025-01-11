public class Main {

    public static void main(String[] args) {

        Generic<Dog,Integer> dog1= new Generic<>(new Dog("Rudy",2,true));
        System.out.println(dog1.getSomeanimalvariable().isGoodboi());
        System.out.println(dog1.getSomeanimalvariable().getAge());


        //Generic<Cat> cat1 = new Generic<>(new Cat("Whiskas"));
    }
}
