public class sumNNaturalNumbers{
    public static void printSum(int i, int n, int sum){
        if(i == n){
            System.out.println("Sum : "+(sum+i));
            return;
        }
        
        sum += i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}