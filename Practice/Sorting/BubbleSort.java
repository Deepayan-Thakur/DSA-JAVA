package Practice.Sorting;

import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
