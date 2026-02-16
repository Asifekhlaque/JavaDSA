class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node head;

    void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            newNode.next = newNode;
            this.head = newNode;
            return;
        } else {
            Node temp = this.head;
            while (temp.next != this.head) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            // or newNode.next=this.head;
            temp.next = newNode;
        }
    }

    void addNodeAtBegin(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            newNode.next = newNode;
            this.head = newNode;
            return;
        } else {
            Node temp = this.head;
            while (temp.next != this.head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    void addAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if (this.head == null) {
            newNode.next = newNode;
            this.head = newNode;
            return;
        } else {
            Node temp = this.head;
            int cnt = 0;
            while (temp.next != this.head) {
                if (cnt == pos - 1) {
                    break;
                }
                temp = temp.next;
                cnt++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void display() {
        if (this.head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = this.head;
            while (temp.next != this.head) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    int deleteAtBegin() {
        if (this.head == null) {
            System.out.println("Linked List is empty");
            return -1;
        } else {
            Node temp = this.head;
            while (temp.next != this.head) {
                temp = temp.next;
            }
            Node tt=head;
            temp.next = this.head.next;
            this.head = temp.next;
            tt.next = null;
            return tt.data;
        }
    }

    int dataAtEnd(){
        if(this.head==null){
            System.out.println("Linked List is empty");
            return -1;
        }
        else{
            Node temp=this.head;
            Node tt=this.head;
            while (temp.next != this.head) {
                tt=temp;
                temp = temp.next;
            }
            tt.next=head;
            temp.next=null;
            return temp.data;
        }
    }

    int deleteAtPos(int pos){
        if(this.head==null){
            System.out.println("Linked List is empty");
            return -1;
        }
        else{
            Node temp=this.head;
            int cnt=0;
            while (temp.next != this.head) {
                if(cnt==pos-1){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNodeAtEnd(10);
        cll.addNodeAtEnd(20);
        cll.addNodeAtEnd(30);
        cll.addNodeAtEnd(40);
        cll.addNodeAtEnd(50);
        cll.addNodeAtEnd(60);
        cll.display();
        System.out.println("Deleted data is " + cll.deleteAtBegin());
        System.out.println("Deleted data is " + cll.deleteAtBegin());
        System.out.println("Deleted data is " + cll.deleteAtBegin());
        cll.display();

    }
}