package PracticeRecursion;

public class factorialOfNumber {
    public static int fact(int num, int fact){
        if(num == 1 || num == 0){
            return fact;
        }
        return fact(num-1, fact*num);
    }

    public static void main(String[] args) {
        int num = 5, fact = 1;
        System.out.println("The factorial of "+num+" is "+fact(num, fact));
    }
}
