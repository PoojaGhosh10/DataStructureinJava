package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        // Iterate from the second element to the last element
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;
            
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place the key in its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
