class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    void addNodeAtBegin(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        } else {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
        }
    }
    void addNodeAtEnd(int data){
        if(this.head==null){
            this.head=new Node(data);
            return;
        }
        // The node which last part is null is the last node
        else{
            Node temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeAtBegin(10);
        list.addNodeAtBegin(20);
        list.addNodeAtEnd(30);
        list.addNodeAtEnd(40);
    }
}
