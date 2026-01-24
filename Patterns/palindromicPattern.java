package Patterns;

public class palindromicPattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = n-(n-i); k >= 1; k--){
                System.out.print(k);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
