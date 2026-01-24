package Functions;

import java.util.Scanner;

public class printName{
    public static void printMyName(String name){
        System.out.print("Hello "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        printMyName(name);
    }
} 