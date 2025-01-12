public class LLDeletion {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

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

    public void printLL(){
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+" -> ");
            curNode = curNode.next;
        }

        System.out.println("Null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.print("List is Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.print("List is empty. ");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node LastNode = head.next;
        while(LastNode.next != null){
            LastNode = LastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public static void main(String[] args) {
        LLDeletion list = new LLDeletion();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.printLL();
        
        list.deleteFirst();
        list.printLL();
        
        list.deleteLast();
        list.printLL();
    }





}
