public class PracticeLL {
    public static class Node{
        int data; //value
        Node next; // address of next node
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next = b; // 5 -> 3 9 8 16
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.data);
        System.out.println(a.next.data);
        b.next = c; // 5 -> 3 -> 9 8 16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        Node temp = a;
        for(int i = 0; i < 5; i++){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

        // As we don't always know the size of the given data
        // Therefore, we use while loop ---
        Node temp2 = a;
        while(temp2 != null){
            System.out.print(temp2.data + " -> ");
            temp2 =  temp2.next;
        }
        System.out.print("null");

    }
}
