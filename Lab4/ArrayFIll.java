import java.util.Arrays;

public class ArrayFIll {
    public static void main(String[] args){
        // create array
        int[] arr = new int[3];
        // fill in a array value 1
        for (int i = 0; i < arr.length; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
