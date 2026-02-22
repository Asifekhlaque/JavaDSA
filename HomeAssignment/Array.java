public class Array {


    // 1.Find Missing Number
    public void FindMissingNumber(){
        int arr[]={1,2,3,5};
        boolean miss=false;
        int data=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                miss=true;
                data=i+1;
                break;
            }
        }
        if(miss){
            System.out.println("Missing number is "+data);
        }
        else{
            System.out.println("No missing number");
        }

    }
    // 2.	Reverse an Array
    void ReverseAnArray(){
        int arr[]={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
    }

    //3.	Move Zeroes
    void moveZeroes(){
        int arr[]={0,1,0,3,12};
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
        }
        while (idx<arr.length) {
            arr[idx]=0;
            idx++;
        }
        //Printing Array
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
    }

    //4.	Remove Duplicates from Sorted Array

    void removeDuplicates(){
        int arr[]={1,2,3,3,3,4,4,5,8,8};
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[idx]!=arr[i]){
                idx++;
                arr[idx]=arr[i];
            }
        }
        for(int a=0;a<=idx;a++){
            System.out.println(arr[a]);
        }
    }

    //8.	Second Largest

    void secondLargest(){
        int arr[]={1,4,2,3,5};
        int max1,max2;
        if(arr[0]<arr[1]){
            max1=arr[1];
            max2=arr[0];
        }
        else{
            max1=arr[0];
            max2=arr[1];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("Second largest number is "+max2);
    }

    //9.	Merge Sorted Arrays

    void MergeSortedArrays(){
        int arr[]={1,3,5,7};
        int arr2[]={2,4,6,8};
        int arr3[];
        arr3=new int[arr.length+arr2.length];
        for(int i=0;i<arr.length+arr2.length;i++){
            if(i<arr.length){
                arr3[i]=arr[i];
            }
            else{
                arr3[i]=arr2[i-arr.length];
            }
        }
        System.out.println("Array after merging");
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }

    void rotate(){
        int arr[]={1,2,3,4,5};
        int data=arr[arr.length-1];
        int temp=arr[0];
        for(int i=1;i<arr.length-2;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        arr[0]=data;
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }





    public static void main(String[] args) {
        Array obj=new Array();
        //obj.FindMissingNumber();
        //obj.ReverseAnArray();
        // obj.secondLargest();
        // obj.MergeSortedArrays();
        // obj.rotate();
        //obj.moveZeroes();
        obj.removeDuplicates();
    }
}
