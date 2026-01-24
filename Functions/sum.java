package Functions;

import java.util.Scanner;

public class sum {
    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.println(num1+" + "+num2+" = "+sumOfNumbers(num1, num2));
    }
}
