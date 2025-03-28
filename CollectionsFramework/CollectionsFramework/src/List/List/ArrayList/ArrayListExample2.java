package List.ArrayList;

import List.Student;

import java.util.*;

public class ArrayListExample2 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(new Random().nextInt(1000));
        }

        System.out.println(list);

        Comparator<Integer> comparator = (Integer o1 , Integer o2) -> o2-o1;
        list.sort(comparator);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,2,5,3));
        list2.sort(null);
        System.out.println(list2);

        Student s1 = new Student("Rahul",3.7);
        Student s2 = new Student("Archana",4.0);
        Student s3 = new Student("Dudu",69.0);
        Student s4 = new Student("Bubu",42.0);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println(studentList);
        studentList.sort((o1,o2) -> {
            double result = o2.getGpa()-o1.getGpa();
            if (result <0){
                return -1;
            } else if (result >0) {
                return 1;
            }
            else {
                return 0;
            }

        });
        System.out.println(studentList);


        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Sweet lime");
        stringList.add("Avocado");
        stringList.sort(null);
        System.out.println(stringList);

        Comparator<String> comparator1 = (str1,str2) -> str2.length()-str1.length();
        stringList.sort(comparator1);
        System.out.println(stringList);

    }
}
