package Loops;

import java.util.*;

public class table {
    public static void main(String[] args) {
        
        // Taking the input from the user --
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number whose table you want : ");
        int n = s.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
