class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackList {
    //LIFO->Add at Top(Push) and Remove from Top(Pop) or Add at Bottom(Push) and Remove from Bottom(Pop)
    Node head;
    void addAtTop(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    int deleteFromTop(){
        if(head==null){
            return -1;
        }
        else{
            int data=head.data;
            head=head.next;
            return data;
        }
    }

    void display(Node head){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            display(head.next);
            System.out.println(head.data);
        }
    }


    int getTop(){
        if(head==null){
            return -1;
        }
        else{
            return head.data;
        }
    }
    public static void main(String[] args) {
        StackList sl=new StackList();
        sl.addAtTop(10);
        sl.addAtTop(20);
        sl.addAtTop(30);
        sl.display(sl.head);
        System.out.println("Deleted Element is "+sl.deleteFromTop());
        System.out.println("Top Element is "+sl.getTop());
    }


}
