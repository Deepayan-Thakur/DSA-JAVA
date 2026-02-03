package Patterns.HomeWorkPatterns;

public class solidRhombus{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}