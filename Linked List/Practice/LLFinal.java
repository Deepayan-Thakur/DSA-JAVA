package Practice;

public class LLFinal {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    // Insert method --- 
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    // Remove method --- 
    public void removeLast(){
        if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // Display method --- 
    public void printLL(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        LLFinal list = new LLFinal();
        list.addLast(0);
        list.addLast(1);
        list.addLast(4);
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        list.printLL();

        list.removeLast();
        list.printLL();
        
    }
}
