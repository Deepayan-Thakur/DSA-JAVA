public class LL1 {
    Node head;
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data = data;
            this.next = null;   
        }
    }

    // add - last
    public void addLast(String data){
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

    // print the linked list
    public void printLL(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+" -> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.addLast("F");
        list.printLL();
    }
}
