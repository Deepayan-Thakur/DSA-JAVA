import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        String[] names = {"Mesiam","Sarah", "Tom", "Brad", "Brian"};
        int[] numbers = {12333,6565675,687878,5345345,2342352};

        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.print("Please Enter a name: ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        for( int i = 0; i<names.length; i++){
            if(name.equals(names[i]))
                System.out.println("The number is: "+numbers[i]);
        }
    }
}
