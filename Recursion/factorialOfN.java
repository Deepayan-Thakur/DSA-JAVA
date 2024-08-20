public class factorialOfN {
    public static int fact(int num, int fact){
        if(num == 1 || num == 0){
            return fact;
        }
        fact *= num;
        return fact(num-1, fact);
    }

    public static void main(String[] args) {
        int num = 6, fact = 1;
        System.out.println("The factorial of "+num+" is "+(fact(num, fact))); 
    }
}
