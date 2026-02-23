package Algorathms;

public class Bubble {
    int arr[]={2,77,1,89};
    //Bubble Sort
    //Time Complexity O(n^2) means it is a quadratic algorithm
    void bubbleSort() {
        for (int i = 0; i < arr.length -1; i++){
        boolean flage = false;
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flage = true;
                }
            if (flage == false)

                break;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }

    public static void main(String[] args) {
        Bubble obj=new Bubble();
        obj.bubbleSort();
    }
    
}

