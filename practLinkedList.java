class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class practLinkedList {
    Node head;
    void addNodeAtEnd(int data){
        if(this.head==null){
            this.head=new Node(data);
            return;
        }
        else{
            Node temp=this.head;
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.next=new Node(data);
        }
    }

    void addNodeAtBegin(int data){
        if(this.head==null){
            this.head=new Node(data);
            return;
        }
        else{
            Node newNode=new Node(data);
            newNode.next=this.head; // n4.next=n1
            this.head=newNode;
        }
    }

    void addAtPos(int data,int pos){
        if(this.head==null){
            this.head=new Node(data);
            return;
        }
        else{
            Node temp=this.head;
            int cnt=0;
            while (temp.next != null) {
                if(cnt==pos-1){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
            Node newNode=new Node(data);
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    void display(){
        if(this.head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=this.head;
            while (temp != null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    void deletefromEnd(){
        if(this.head==null){
            return;
        }
        else{
            Node temp=this.head;
            while (temp.next.next != null) {
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    void deletefromBegin(){
        if(this.head==null){
            System.out.println("Linked List is empty");
        }
        else{
            this.head=this.head.next;
            return;
        }
    }

    void delAtPos(int pos){
        if(this.head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=this.head;
            int cnt=0;
            while (temp.next != null) {
                if(cnt==pos-1){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
            temp.next=temp.next.next;
        }
    }

    // Search Node position
    void search(int data){
        if(this.head==null){
            System.out.println("Linked List is empty");
        }
        Node temp=this.head;
        int cnt=0;
        boolean flag=false;
        while (temp!=null) {
            if(temp.data==data){
                flag=true;
                break;
            }
            temp=temp.next;
            cnt++;
        }
        if (flag==true) {
            System.out.println("Node is present at "+cnt+" position");
        }
        else{
            System.out.println("Node is not present");
        }
    }
    public static void main(String[] args) {
        practLinkedList list=new practLinkedList();
        list.addNodeAtEnd(10);
        list.addNodeAtEnd(20);
        list.addNodeAtEnd(30);
        list.display();
        // System.out.println("______________Deleted Successfully_____________");
        // list.deletefromEnd();
        // list.display();
        // System.out.println("______________Search Node Position_____________");
        // list.search(30);

        // System.out.println("______________Add Node At Begin_____________");
        // list.addNodeAtBegin(40);
        // list.display();
        // System.out.println("______________Search Node Position_____________");
        // list.search(40);

        // System.out.println("______________Delete Node At Begin_____________");
        // list.deletefromBegin();
        // list.display();

        System.out.println("______________Add Node At Position_____________");
        list.addAtPos(40,1);
        list.display();
    }
}
