package Functions;

import java.util.Scanner;

public class evenOdd {
    public static boolean evenOrOdd(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        if(evenOrOdd(num)){
            System.out.println(num+" is Even.");
        }
        else{
            System.out.println(num+" is Odd.");
        }
    }
}
