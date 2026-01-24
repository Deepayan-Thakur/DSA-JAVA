package Functions;

import java.util.Scanner;

public class product {
    public static int productOfNumbers(int num1, int num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.println(num1+" x "+num2+" = "+productOfNumbers(num1, num2));
    }
}
