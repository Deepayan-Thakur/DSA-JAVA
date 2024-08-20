public class recursionForwardNumbers {
    public static void printForward(int num){
        if(num == 6)
            return;
        
        System.out.print(num+", ");    
        printForward(num+1);
    }
    public static void main(String[] args) {
        printForward(1);
    }
}
