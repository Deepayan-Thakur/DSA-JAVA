package Practice;

import java.lang.Math;

public class angstrom {
    public static void main(String[] args) {
        int num = 153, rem = 0, sum = 0, n = 0;
        int temp = num;
        while(num > 0){
            rem = num % 10;
            n++;
            num /= 10;
        }
        
        num = temp;
        while(num > 0){
            rem = num % 10;
            sum += Math.pow(rem,n);
            num /= 10;
        }
        if (sum == temp){
            System.out.println("The number " + temp + " is an angstrom.");
        }
        else{
            System.out.println("The number " + temp + " is not an angstrom.");
        }
    }
}
