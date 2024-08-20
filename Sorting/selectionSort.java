
// Sorting with O(n^2) as time complexity

public class selectionSort{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for(int i = 0; i < arr.length; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    // Swap
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }
}