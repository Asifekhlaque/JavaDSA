public class Array {

    // 1.Find Missing Number
    public void FindMissingNumber() {
        int arr[] = { 1, 2, 3, 5 };
        boolean miss = false;
        int data = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                miss = true;
                data = i + 1;
                break;
            }
        }
        if (miss) {
            System.out.println("Missing number is " + data);
        } else {
            System.out.println("No missing number");
        }

    }

    // 2. Reverse an Array
    void ReverseAnArray() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }

    // 3. Move Zeroes
    void moveZeroes() {
        int arr[] = { 0, 1, 0, 3, 12 };
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx] = arr[i];
                idx++;
            }
        }
        while (idx < arr.length) {
            arr[idx] = 0;
            idx++;
        }
        // Printing Array
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }

    // 4. Remove Duplicates from Sorted Array

    void removeDuplicates() {
        int arr[] = { 1, 2, 3, 3, 3, 4, 4, 5, 8, 8 };
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[idx] != arr[i]) {
                idx++;
                arr[idx] = arr[i];
            }
        }
        for (int a = 0; a <= idx; a++) {
            System.out.println(arr[a]);
        }
    }

    // 5. Second Largest

    void secondLargest() {
        int arr[] = { 1, 4, 2, 3, 5 };
        int max1, max2;
        if (arr[0] < arr[1]) {
            max1 = arr[1];
            max2 = arr[0];
        } else {
            max1 = arr[0];
            max2 = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest number is " + max2);
    }

    // 6. Max Consecutive Ones
    void maxOnes() {
        int arr[] = { 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt > max) {
                max = cnt;
            }
        }
        System.out.println("Max Consecutive Ones are " + max);
    }

    // 7. Check if Sorted Array
    void checkSorted() {
        int arr[] = { 5, 4, 3, 2, 1 };
        boolean asc = true;
        boolean desc = true;
        for (int i = 0; i < arr.length - 1; i++) {
            // desc
            if (arr[i] > arr[i + 1]) {
                asc = false;
            }
            // asc
            if (arr[i] < arr[i + 1]) {
                desc = false;
            }
        }
        if (asc) {
            System.out.println("Array is Sorted in Ascending Order");
        } else if (desc) {
            System.out.println("Array is Sorted in Descending Order");
        } else {
            System.out.println("Array is not Sorted");
        }

    }
    // 8. Two Sum

    void twoSum(int target) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                System.out.println("Pair is " + arr[i] + " " + arr[i + 1]);
            }
        }
    }

    // 9. Merge Sorted Arrays

    void MergeSortedArrays() {
        int arr[] = { 1, 3, 5, 7 };
        int arr2[] = { 2, 4, 6, 8 };
        int arr3[];
        arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length + arr2.length; i++) {
            if (i < arr.length) {
                arr3[i] = arr[i];
            } else {
                arr3[i] = arr2[i - arr.length];
            }
        }
        System.out.println("Array after merging");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }

    // 10. Rotate Array
    void rotateArray(int k){
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    k = k % n;

    int newArr[] = new int[n];

    for(int i=0; i<n; i++){
        newArr[(i + k) % n] = arr[i];
    }

    for(int i=0; i<n; i++){
        System.out.print(newArr[i] + " ");
    }
}

    public static void main(String[] args) {
        Array obj = new Array();
        // obj.FindMissingNumber();
        // obj.ReverseAnArray();
        // obj.secondLargest();
        // obj.MergeSortedArrays();
        // obj.rotate();
        // obj.moveZeroes();
        // obj.removeDuplicates();
        // obj.checkSorted();
        // obj.twoSum(5);

        obj.rotateArray(4);
    }
}
