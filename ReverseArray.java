//import java.io.*;>?<m
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        
        int[] array = {4, 5, 1, 2, -8};
        String s=Arrays.toString(array);
        System.out.println(s);
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }

        System.out.println("Reversed array: "+Arrays.toString(array));
        
    }
}