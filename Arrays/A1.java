public class A1 {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks); // this will print a garbage value
        System.out.println(marks[0]); 
        System.out.println(marks[1]); 
        System.out.println(marks[2]); 

        // The above can be written as ---
        for(int i = 0; i < 3;i++){
            System.out.println(marks[i]);
        }
    }
}
