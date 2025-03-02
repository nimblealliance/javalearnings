import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReadTest {

    public static void main(String[] args) {

        String fileName="C:\\Users\\Rahul\\Desktop\\enwik8";//95 MB text file
        System.out.println("Reading without buffer...");
        long startTime1 = System.currentTimeMillis();
        try(FileReader reader = new FileReader(fileName)){
            int i;
            while((i = reader.read()) != -1){

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken without buffer: " + (endTime1 - startTime1) + " ms\n");

        System.out.println();
        System.out.println("Reading with buffer...");
        long startTime2 = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName),16000)){
            while (reader.readLine() != null) {
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken with buffer: " + (endTime2 - startTime2) + " ms\n");
    }

}