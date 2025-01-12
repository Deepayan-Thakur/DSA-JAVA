package Practice;

public class LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void printLL(){
        if(head == null){
            System.out.print("The List is Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // Deletion - First ----
    public void removeFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        head = head.next;

    }

    // Deletion - last ----
    public void removeLast(){
        // if the head is null ---
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        
        // if there is only 1 element ---
        if(head.next == null){
            head = null;
            return;
        }

        // otherwise ---
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();

        // Adding 4 integers ---
        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        // displaying the list ---
        list.printLL();
        
        // displaying after the deletion of the last element from the linked list -- 
        list.removeLast();
        list.printLL();
        
        // displaying after the deletion of the First element from the linked list -- 
        list.removeFirst();
        list.printLL();

    }
}
