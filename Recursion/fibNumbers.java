public class fibNumbers {
    public static void fib(int first, int second, int num){
        if(num == 15){
            System.out.print(first+", ");
            return;
        }
        System.out.print(first+", ");
        int temp = first+second;
        first = second;
        second = temp;
        fib(first, second, num+1);
    }
    public static void main(String[] args) {
        fib(0, 1, 1);
    }
}