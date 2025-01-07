import java.util.Arrays;

public class GenericSwap {

    public static <T> void swap(T[] arr , int index1 , int index2){

        T temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr1));
        swap(arr1,5,3);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"Java","Generics","are","cool!!!"};
        System.out.println(Arrays.toString(arr2));
        swap(arr2,3,1);
        System.out.println(Arrays.toString(arr2));
    }
}
