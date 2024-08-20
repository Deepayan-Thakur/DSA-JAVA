package PracticeRecursion;

public class RecursiveSum {
    public static void sum(int initial, int endNum, int sum){
        if(initial == endNum){
            System.out.println("The sum is: "+(sum+initial));
            return;
        }
        sum += initial;
        sum((initial + 1), endNum, sum);
    }

    public static void main(String[] args) {
        int initial = 1, endNum = 6, sum = 0;
        sum(initial, endNum, sum);
    }
}
