package Practice;

import java.util.Scanner;

public class odd_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();

        if(num % 2 != 0){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Not an Odd Number.");
        }
    }
}
