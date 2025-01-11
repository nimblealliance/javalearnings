import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pair<String,String> user1 = new Pair<>("Name","Rahul");
        user1.printPair();

        Pair<String,Integer> user2 = new Pair<>("Password",123456);
        user2.printPair();

        Pair<String,String> user3 = new Pair<>("Username","rdm190394");
        user3.printPair();

        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(user1);
        pairs.add(user2);
        pairs.add(user3);

        System.out.println();
        for (Pair p : pairs){
            System.out.println(p);
        }

    }

}
