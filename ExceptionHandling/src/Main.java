import Code2.ExceptionHandling3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] num = {10,20,30,40};
        int[] denum = {1,2,0,4};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(divide(num[i], denum[i]));
            } catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("-1");
            }
        }

        try{
            test1();
        } catch (ExceptionHandling3 e) {
            System.out.println("Forget about it");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        String fileName= "C:\\Users\\Rahul\\Desktop\\Links_to_checkout.txt";
        System.out.println(fileName);
        try (FileReader fileReader = new FileReader(fileName))
            {
                System.out.println("File opened");
                int i;
                while ((i=fileReader.read()) != -1){
                    System.out.print((char) i);
                }
            }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println();
        String fileName2= "C:\\Users\\Rahul\\Desktop\\Anotherone.txt";
        try{
            FileReader fileReader = new FileReader(fileName2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i;
            while((i=fileReader.read()) != -1){
                System.out.print((char) i);
            }
            fileReader.close();
        }catch (IOException e){
            throw new RuntimeException();
        }

    }

    public static int divide(int a , int b) {
        return a/b;
    }

    public static void test1() throws ExceptionHandling3 {
        throw new ExceptionHandling3("Boo");
    }

}

