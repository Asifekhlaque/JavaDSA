class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DoubleLinkedList {
    Node head;
    public void addNodeAtBegin(int data){
        Node newNode=new Node(data);
        if(this.head==null){
            this.head=newNode;
            return;
        }else{
            newNode.next=this.head;
            head.prev=newNode;
            this.head=newNode;
        }
    }
    public void addAtEnd(int data){
        Node newNode=new Node(data);
        if(this.head==null){
            this.head=newNode;
            return;
        }
        else{
            Node temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }

    void addAtPos(int data,int pos){
        Node newNode=new Node(data);
        if(this.head==null){
            this.head=newNode;
            return;
        }else{
            Node temp=this.head;
            int cnt=0;
            while(temp.next!=null){
                if(cnt==pos-1){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
            newNode.prev=temp;
            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;
        }
    }

    void display(){
        if(this.head==null){
            System.out.println("Linked List is empty");
        }else{
            Node temp=this.head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    void displayRev(){
        if(this.head==null){
            System.out.println("Linked List is empty");
        }else{
            Node temp=this.head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.prev;
            }
        }
    }

    int deleleFromBegin(){
        if(this.head==null){
            return -1;
        }else{
            Node temp=this.head;
            temp.next.prev=null;
            this.head=temp.next;
            temp.next=null;
            return temp.data;
        }
    }

    int deletefromEnd(){
        if(this.head==null){
            return -1;
        }
        else{
            Node temp=this.head;
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.prev.next=null;
            temp.prev=null;
            return temp.data;
        }
        /* or
            Node temp;
            for(Node temp=this.head;temp.next!=null;temp=temp.next);
            temp.prev.next=null;
            temp.prev=null;
            return temp.data;
        */
    }

    int deleteFromPos(int pos){
        if(this.head==null){
            return -1;
        }
        else{
            Node temp=this.head;
            int cnt=0;
            while (temp.next!=null) {
                cnt++;
                if(cnt==pos){
                    break;
                }
                temp=temp.next;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            temp.next=temp.prev=null;
            return temp.data;
        }
    }

    void search(int pos){
        if(this.head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=this.head;
            int cnt=0;
            while(temp.next!=null){
                if(cnt==pos-1){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
            System.out.println(temp.data);
        }
    }

    int countNode(){
        int cnt=0;
        if(this.head==null){
            return cnt;
        }
        else{
            Node temp=this.head;
            // cnt++;
            while(temp
            
            
            !=null){
                cnt++;
                temp=temp.next;
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList l1=new DoubleLinkedList();
        l1.addNodeAtBegin(10);
        l1.addNodeAtBegin(100);
        l1.addNodeAtBegin(80);
        l1.display();
        // System.out.println("------Reverse------");
        // l1.displayRev();

        // l1.deletefromEnd();

        System.out.println("------Count------\n"+l1.countNode());
        
    }

}
