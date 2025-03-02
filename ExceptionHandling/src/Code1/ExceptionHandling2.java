package Code1;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        Object ob1 = null;
        try {
            ob1.toString();

        } catch (NullPointerException npe){
            System.out.println(npe);
        }

        try {
            int a = 10 , b = 0;
            System.out.println(a/b);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sup");

        Object obj2 = new Object();
        obj2=null;

        try {
            obj2.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new NullPointerException();
        }
    }
}
