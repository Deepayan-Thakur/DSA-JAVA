package Patterns;

public class floydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1, m =1; i <= n; i++){
            for(int j = 1; j <= i; j++, m++){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}