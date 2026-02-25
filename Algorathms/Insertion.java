


public class Insertion {
    int arr[] = { 4, 12,5, 6};

    void sort() {
        
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j=i-1;
            while (arr[i] > key && j >= 0) {
                arr[j + 1] = arr[j];
                j--;
            } 
            arr[j + 1] = key;
            Arrprint();
            System.out.println("");
            // System.out.print(arr[i] + " ");
        }
        
    }

    void Arrprint() {
        for (int n:arr) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Insertion obj = new Insertion();
        obj.sort();
        
    }
}
