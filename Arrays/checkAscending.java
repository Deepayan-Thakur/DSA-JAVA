import java.util.Scanner;

public class checkAscending {
    public static boolean ascendingOrNot(int array[]){
        for(int i = 0; i < (array.length-1); i++){
            if(array[i] > array[i+1]){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        if(ascendingOrNot(arr)){
            System.out.println("The elements in the array is in Ascending Order.");
        }
        else{
            System.out.println("The elements in the array is not in Ascending Order.");
        }
    }
}
