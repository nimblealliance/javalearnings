public class Main {

    public static void main(String[] args) {

        Student rahul = new Student("Rahul", 85);
        Student archana = new Student("Archana", 95);

        if (rahul.compareTo(archana) > 0) {
            System.out.println("Rahul rocks");
        } else {
            System.out.println("Archana rocks");
        }
    }
}
