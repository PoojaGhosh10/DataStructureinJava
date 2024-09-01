package sorting;

import java.util.Arrays;

//merge sort in place
public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        System.out.println("left" +start +" " + mid );
        mergeSort(arr, start, mid);
        System.out.println("right" +(mid+1) +" " + end );
        mergeSort(arr, mid+1, end);
        

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;//start is not directly used because it will be used later so cannot be directly updated
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half, if any
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back into the original array
        for (int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6, 4, 3, 2, 1};
        System.out.println("Unsorted ARRAY:" +Arrays.toString(arr));
        mergeSort(arr, 0, arr.length -1);
        System.out.println("Sorted ARRAY:" +Arrays.toString(arr));
    }
}
