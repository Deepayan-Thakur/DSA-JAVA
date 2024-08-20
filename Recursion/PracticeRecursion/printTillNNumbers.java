package PracticeRecursion;

public class printTillNNumbers {
    public static void printNumbers(int num){
        if(num == 10){
            System.out.print(num+", ");
            return;
        }
        System.out.print(num+", ");
        printNumbers(num+1);
    }

    public static void main(String[] args) {
        int num = 1;
        printNumbers(num);
    }
}
