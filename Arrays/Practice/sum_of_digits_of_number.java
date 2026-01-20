package Practice;

import java.util.Scanner;

public class sum_of_digits_of_number {
    public static void main(String[] args) {
        int sum = 0, rem = 0, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        temp = num;
        while (num>0){
            rem = num%10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of Digits of "+temp+" is "+sum);
    }
}
