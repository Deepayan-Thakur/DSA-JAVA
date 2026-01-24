package Loops;

import java.util.*;
public class loop3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the last natural number upto which you want the sum : ");
        int n = s.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum of the natural numbers till "+n+" is "+sum);
    }
}
