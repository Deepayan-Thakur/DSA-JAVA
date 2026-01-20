package Practice;

public class sum_of_odd_number {
    public static void main(String[] args) {
        int sum = 0;
        for (int iterate = 1 /* Starting from 1 */; iterate < 101 /* till 100 */; iterate += 2/* for odd numbers */) {
            sum += iterate;
        }
        System.out.println("Sum : " + sum);
    }
}
