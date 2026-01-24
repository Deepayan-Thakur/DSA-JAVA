package Patterns;

public class invertedHalfPyramidRotated{
    public static void main(String[] args) {
        int n = 4;
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= n-1; j++){
                if(i <= j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}