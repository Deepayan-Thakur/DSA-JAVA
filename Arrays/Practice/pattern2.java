package Practice;

import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        // Floyds triangle ---
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in floyds triangle : ");
        int num = s.nextInt();
        for (int i = 0, a = 1; i < num; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(a+++" ");
            }
            System.out.println();
        }
    }
}