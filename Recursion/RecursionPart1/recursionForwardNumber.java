package RecursionPart1;

public class recursionForwardNumber {
    public static void printNum(int i, int num){
        if(i == num){
            return;
        }
        System.out.print(i+1 + " ");
        i++;
        printNum(i, num);
        
    }

    public static void main(String[] args) {
        int num = 5;
        printNum(0, num);
    }
}
