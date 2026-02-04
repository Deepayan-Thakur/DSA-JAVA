package StacksWithLL;

import java.util.ArrayList;
import java.util.LinkedList; // Class of LL

public class StacksWithLinkedList {
    public static void main(String[] args) {
        // Linked List as Stack;
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.getLast(); // peek
        ll.removeLast(); // pop
        ll.size();
        ll.isEmpty();
        ll.indexOf(3);

        // Arraylist as Stack;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size()-1); // peek
        arrayList.remove(arrayList.size()-1); // pop


    }
}
