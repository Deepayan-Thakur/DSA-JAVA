class LL{
    Node head;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add - fist
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

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

    // Print Linked List
    public void printLL(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node curNode = head;
        while (curNode != null){
            System.out.print(curNode.data+" -> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("A");
        list.addFirst("is");
        list.printLL();


    }
}