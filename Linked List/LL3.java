public class LL3 {
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
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    public void printLL(){
        Node newNode = head;
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        System.out.print("Null");
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printLL();
    }
}
