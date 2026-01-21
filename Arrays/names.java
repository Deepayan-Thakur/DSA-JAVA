import java.util.Scanner;
public class names{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names : ");
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i = 0; i < names.length; i++){
            System.out.print("Enter the name of Person "+(i+1)+" : ");
            names[i] = sc.next();
        }
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}