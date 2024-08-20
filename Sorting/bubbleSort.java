
// Sorting with O(n^2) as time complexity

public class bubbleSort{
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}