package Map.HashMap;

import java.util.HashMap;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {


        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob",2);
        Person p3 = new Person("Alice",1);

        map.put(p1,"Engineer"); // hashcode1 ---> index1
        map.put(p2,"Designer"); // hashcode2 ---> index2
        map.put(p3,"Manager"); // hashcode3 ---> index3
        System.out.println("Size of map: "+map.size());

        //uses Object class's hashcode method to generate hash , that hashcode method is a representation of memory where the object exists so p1 and p3 even after having a same
        // field name will have different hashcode and stored at a different bucket in map , so size is 3




        HashMap<String , Integer> map1 = new HashMap<>();
        map1.put("Rahul",69);  //hashcode 1 ---> index1
        map1.put("Nimble",420); //hashcode 2 ---> index2
        map1.put("Rahul",69420);//hashcode 1 ---> index1 --> equals() ---> replace
        System.out.println("Size of map: "+map1.size());
        //since we are using String class as the key here , when we run the 'map1.put("Rahul",69420)' statement , the calculated hashcode will be same since it will be using String class's
        //hashcode() method's implementation to calculate it , since the equals() method will show Rahul equals Rahul , it will go ahead and replace '69' with '69420' , so the size remains as 2



    }

}

class Person{

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
