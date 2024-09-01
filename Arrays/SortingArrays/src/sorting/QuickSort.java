package sorting;

import java.util.Arrays;

public class QuickSort {

    // Partition method to place the pivot element in its correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choosing the first element as the pivot
        int left = low + 1;
        int right = high;

        while (left <= right) {
            // Increment left index while the element is less than or equal to pivot
            while (left <= right && arr[left] <= pivot) {
//            	System.out.println("left "+ left);
                left++;
            }

            // Decrement right index while the element is greater than pivot
            while (right >= left && arr[right] > pivot) {
//            	System.out.println("right "+ right);
                right--;
            }
//            System.out.println("left "+ left + "right" + right);

            // Swap elements if left index is less than or equal to right index
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Swap pivot element with element at the right index
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right; // Return the partition index
    }

    // Quick Sort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,13,4,1, 2, 7, 8, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
