import java.util.*;

public class ArrayRotateLeft{

    public static void reverse(int arr[], int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void leftRotate(int arr[], int n, int d){
        reverse(arr, 0, d-1); // 1st half rotate
        reverse(arr, d, n-1); // 2nd half rotate
        reverse(arr, 0, n-1); // complete rotate
    }

    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3}; // -> {1,2,3,7,8};
        System.out.println("Original : " + Arrays.toString(arr));
        leftRotate(arr, arr.length, 2);
        System.out.println("Updated left Rotated : " + Arrays.toString(arr));
    }
}