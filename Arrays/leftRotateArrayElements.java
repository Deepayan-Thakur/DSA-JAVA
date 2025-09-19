import java.util.*;

public class leftRotateArrayElements{
    
    public static void reverse(int[] arr, int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void leftRotate(int[] arr, int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        leftRotate(arr, arr.length, 2);
        System.out.println(Arrays.toString(arr));
    }

}