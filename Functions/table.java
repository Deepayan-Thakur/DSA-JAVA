package Functions;

import java.util.Scanner;

public class table {
    public static void tableOfNumber(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        tableOfNumber(num);
    }
}
