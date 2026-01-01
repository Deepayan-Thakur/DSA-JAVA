import java.util.*;

public class LLCollections {
    public static void main(String[] args) {
        LinkedList<Integer> node1 = new LinkedList<>();
        node1.add(1);
        node1.add(2);
        node1.add(3);
        node1.addLast(12);
        node1.addFirst(99);

        System.out.println(node1.get(0));
        System.out.println(node1.getFirst());
        System.out.println(node1.getLast());

        System.out.println(node1);
    }
}
