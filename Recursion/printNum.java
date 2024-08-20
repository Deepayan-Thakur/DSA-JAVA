public class printNum {
    public static void printNumber(int num){
        if(num == 0)
            return;

        System.out.print(num+", ");
        printNumber(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        printNumber(num);
    }
}
