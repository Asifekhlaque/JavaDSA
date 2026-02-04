//Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).
public class StackAsList {
    private int size;
    private int stack[];
    private int top;
    public StackAsList(){
        this.size=5;
        this.stack=new int[size];
        this.top=-1;
    }
    //?Stackoverflow is the exception thrown when the stack is full
    public boolean stackOverFlow(){
        if(this.top==this.size-1){
            return true;
        }else{
            return false;
        }
    }
    //?Stackunderflow is the exception thrown when the stack is empty
    public boolean stackUnderFlow(){
        if(this.top==-1){
            return true;
        }else{
            return false;
        }
    }
    //Pushing
    public void push(int data){
        if(stackOverFlow()){ //if the stack is full
            System.out.println("StackOverflow"); 
        }else{
            this.top++;
            this.stack[this.top]=data;
        }
    }

    //Popping
    public void pop(){
        if(stackUnderFlow()){ //if the stack is empty
            System.out.println("StackUnderflow"); 
            return;
        }else{
            int data=this.stack[this.top];
            System.out.println("Popped element is "+data);
            this.top--;
            //return this.stack[--this.top];
        }
    }

    //Peeking: Returns the element at the top of the stack
    public int peek(){
        if(stackUnderFlow()){
            System.out.println("StackUnderflow"); 
            return -1;
        }else{
            return this.stack[this.top];
        }
    }

    //Displaying the stack
    public void display(){
        if(stackUnderFlow()){
            System.out.println("StackUnderflow"); 
            return;
        }else{
            for(int i=this.top;i>=0;i--){
                System.out.println("|"+this.stack[i]+"|");
            }
        }
    }

    public static void main(String[] args) {
        StackAsList stack=new StackAsList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        stack.display();
        stack.peek();
    }
}
