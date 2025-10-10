package Recursion_Test;

public class factOfN {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fact of "+n+" = "+fact(n));
    }

    public static int fact(int n){
        if(n==0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
