package Functions;

import java.util.Scanner;

public class factorial {
    public static int factorialOfNumber(int num){
        int fact = 1;
        for(int n = num; n >= 1; n--){
            fact *= n;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Teh factorial of "+num+" = "+factorialOfNumber(num));
    }
}
