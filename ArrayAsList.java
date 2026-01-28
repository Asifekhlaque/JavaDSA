public class ArrayAsList {
    //Data Members
    private int size;
    private int arr[];
    private int idx;
    //Using Default Constructor
    public ArrayAsList() {
        this.size = 5;
        this.arr = new int[size];
        this.idx = -1;
    }
    //Using Parameterized Constructor
    public ArrayAsList(int capacity) {
        this.size = capacity;
        this.arr = new int[size];
        this.idx = -1;
    }
    //Adding Method
    public void addAtLast(int data){
        if(this.size-1==this.idx){
            System.out.println("Array is Full");
            return;
        }
        else{
            this.idx++;
            this.arr[this.idx]=data;
        }
    }
    //Methods display
    public void display(){
        if(this.idx==-1){
            System.out.println("Array is Empty");
            return;
        }
        for(int i=0;i<=this.idx;i++){
            System.out.print(this.arr[i]+" | ");
        }
    }
    //Method to show the size of array
    public void size(){
        System.out.println("Size of Array "+this.size);
    }
    public static void main(String[] args) {
        ArrayAsList list=new ArrayAsList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.display();
        list.size();

        /*ArrayAsList list=new ArrayAsList(10);
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.display();
        list.size();*/
    }

}
