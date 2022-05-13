// referenced https://www.geeksforgeeks.org/insertion-sort/
public class InsertionSort {
    static void insertionSort(int arr[]) {
        int n = arr.length;
        // traverse through 1 to last array elements
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
