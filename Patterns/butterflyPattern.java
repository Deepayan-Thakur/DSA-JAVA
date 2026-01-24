package Patterns;

public class butterflyPattern {
    public static void main(String[] args) {
        int n = 5, space1 = (n*2)-2;
        for (int i = 1; i <= n;i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = space1; k >= 1; k--){
                System.out.print(" ");
                
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            space1-=2;
        }
        space1+=2;
        for (int i = n; i >= 1;i--){
            
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= space1; k++){
                System.out.print(" ");
                
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            space1+=2;
        }
    }
}