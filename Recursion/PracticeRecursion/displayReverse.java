package PracticeRecursion;

public class displayReverse {
    public static void reverseDisplay(int num){
        if(num == 1){
            System.out.print(num+", ");
            return;
        }
        System.out.print(num+", ");
        reverseDisplay(num-1);
    }

    public static void main(String[] args) {
        int num = 10;
        reverseDisplay(num);        
    }
}
