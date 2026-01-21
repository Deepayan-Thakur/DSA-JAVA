import java.util.Scanner;

public class maxMin {
    public static int max(int array[]){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static int min(int array[]){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int numArray[] = new int[size];

        for(int i = 0; i < numArray.length; i++){
            System.out.print("Enter the number "+(i+1)+" : ");
            numArray[i] = sc.nextInt();
        }
        System.out.println("The maximum number is : "+max(numArray));
        System.out.println("The minimum number is : "+min(numArray));
    }
}
