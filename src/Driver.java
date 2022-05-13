public class Driver {
    public static void main(String[] args) {
        System.out.println("Size           100     500     1000     10000");
        System.out.printf("Bubble Sort    %.3f   %.3f   %.3f    %.3f\n", timeDifferenceBubbleSort(100), timeDifferenceBubbleSort(500), timeDifferenceBubbleSort(1000), timeDifferenceBubbleSort(10000));
        System.out.printf("Selection Sort %.3f   %.3f   %.3f    %.3f\n", timeDifferenceSelectionSort(100), timeDifferenceSelectionSort(500), timeDifferenceSelectionSort(1000), timeDifferenceSelectionSort(10000));
        System.out.printf("Insertion Sort %.3f   %.3f   %.3f    %.3f\n", timeDifferenceInsertionSort(100), timeDifferenceInsertionSort(500), timeDifferenceInsertionSort(1000), timeDifferenceInsertionSort(10000));
        System.out.printf("Quick Sort     %.3f   %.3f   %.3f    %.3f\n", timeDifferenceQuickSort(100), timeDifferenceQuickSort(500), timeDifferenceQuickSort(1000), timeDifferenceQuickSort(10000));
        System.out.printf("Counting Sort  %.3f   %.3f   %.3f    %.3f\n", timeDifferenceCountingSort(100), timeDifferenceCountingSort(500), timeDifferenceCountingSort(1000), timeDifferenceCountingSort(10000));
    }

    // used for generating an array of random integers of certain length
    static int[] randomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    static double timeDifferenceBubbleSort(int arrLength) {
        long totalTime = 0;
        for (int i = 0; i < 10; i++) {
            int[] arr = randomArray(arrLength);
            // log before running sort
            long startTime = System.nanoTime();
            BubbleSort.bubbleSort(arr);
            // log after running sort
            long endTime = System.nanoTime();
            // calculate time difference
            long timeElapsed = endTime - startTime;
            totalTime += timeElapsed;
        }
        // Return average running time
        return totalTime / 10000000.0;
    }

    static double timeDifferenceSelectionSort(int arrLength) {
        long totalTime = 0;
        for (int i = 0; i < 10; i++) {
            int[] arr = randomArray(arrLength);
            // log before running sort
            long startTime = System.nanoTime();
            SelectionSort.selectionSort(arr);
            // log after running sort
            long endTime = System.nanoTime();
            // calculate time difference
            long timeElapsed = endTime - startTime;
            totalTime += timeElapsed;
        }
        // Return average running time
        return totalTime / 10000000.0;
    }

    static double timeDifferenceInsertionSort(int arrLength) {
        long totalTime = 0;
        for (int i = 0; i < 10; i++) {
            int[] arr = randomArray(arrLength);
            // log before running sort
            long startTime = System.nanoTime();
            InsertionSort.insertionSort(arr);
            // log after running sort
            long endTime = System.nanoTime();
            // calculate time difference
            long timeElapsed = endTime - startTime;
            totalTime += timeElapsed;
        }
        // Return average running time
        return totalTime / 10000000.0;
    }

    static double timeDifferenceQuickSort(int arrLength) {
        long totalTime = 0;
        for (int i = 0; i < 10; i++) {
            int[] arr = randomArray(arrLength);
            // log before running sort
            long startTime = System.nanoTime();
            QuickSort.quickSort(arr, 0, arrLength - 1);
            // log after running sort
            long endTime = System.nanoTime();
            // calculate time difference
            long timeElapsed = endTime - startTime;
            totalTime += timeElapsed;
        }
        // Return average running time
        return totalTime / 10000000.0;
    }

    static double timeDifferenceCountingSort(int arrLength) {
        long totalTime = 0;
        for (int i = 0; i < 10; i++) {
            int[] arr = randomArray(arrLength);
            // log before running sort
            long startTime = System.nanoTime();
            CountingSort.countSort(arr);
            // log after running sort
            long endTime = System.nanoTime();
            // calculate time difference
            long timeElapsed = endTime - startTime;
            totalTime += timeElapsed;
        }
        // Return average running time
        return totalTime / 10000000.0;
    }
}
