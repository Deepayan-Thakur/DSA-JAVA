package Stacks;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        int removedElement = stack.pop();
        System.out.println("Element Removed : "+removedElement);
        System.out.println(stack);
        int peek = stack.peek();
        System.out.println("Element at Top : "+peek);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(3);
        System.out.println("Element "+3+" is at index from top : "+search);
    }
}
