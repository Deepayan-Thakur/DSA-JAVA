package Functions;

import java.util.Scanner;

public class prime {
    public static boolean primeOrNot(int num){
        boolean prime = true;
        for(int i = 2; i <= num/2; i++){
            if(num%i == 0){
                prime = false;
                return prime;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if(primeOrNot(num)){
            System.out.println(num+" is a Prime Number...");
        }
        else{
            System.out.println(num+" is not a Prime Number... ");
        }
    }
}