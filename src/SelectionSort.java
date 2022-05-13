// referenced https://www.geeksforgeeks.org/selection-sort/
public class SelectionSort {
    static void selectionSort(int arr[]) {
        int n = arr.length;

        // traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
