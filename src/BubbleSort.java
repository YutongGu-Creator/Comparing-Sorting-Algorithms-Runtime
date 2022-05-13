// referenced https://www.geeksforgeeks.org/bubble-sort/
public class BubbleSort {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        // traverse through all array elements
        for (int i = 0; i < n - 1; i++)
            // last i elements are already in place
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
