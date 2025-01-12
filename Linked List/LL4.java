public class LL4 {
    
    // Creating the head node ---  
    Node head;

    // Creating the constructor of the Node class ---
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // Insetion ---
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }
    
    // Displaying the data ---
    public void printLL(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data+" -> ");
            curNode = curNode.next; 
        }
        System.out.println("Null");
    }

    // Actual program -----  
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.printLL();
    }
}
