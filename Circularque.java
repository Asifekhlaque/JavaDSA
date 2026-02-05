public class Circularque {
    int size;
    int[] queue;
    int fIdx;
    int rIdx;

    public Circularque() {
        this.size = 5;
        this.queue = new int[size];
        this.fIdx = -1;
        this.rIdx = -1;
    }

    void enqueue(int data) {
        if (fIdx - 1 == rIdx) {
            System.out.println("Queue is Full");
            return;
        } else if (fIdx == -1 && rIdx == -1) {
            fIdx = rIdx = 0;
            queue[rIdx] = data;
        } else {
            rIdx = (rIdx + 1) % size;
            queue[rIdx] = data;
            System.out.println("Added Successfully");
        }
    }

    void dequeue() {
        int data;
        if (fIdx == -1 && rIdx == -1) {
            System.out.println("Queue is Empty");
            return;
        } else if (fIdx == rIdx && fIdx != -1) {
            fIdx = rIdx = -1;
            data = queue[fIdx];
        } else {
            data = queue[fIdx];
            fIdx = (fIdx + 1) % size;
            System.out.println("Deleted Successfully and Deleted Element is " + data);
        }
    }

    void display() {
        if (fIdx == -1 && rIdx == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        else{
            int i=fIdx;
            do{
                System.out.print(queue[i]+" | ");
                i=(i+1)%size;
            }while(i!=(rIdx+1)%size);
        }
    }

    public static void main(String[] args) {
        Circularque obj = new Circularque();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);

        obj.display();
        obj.dequeue();
        obj.display();
    }
}
