package sorting;

import java.util.Arrays;

//merge sort using different arrays to store each of those split arrays.
public class MergeSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,7,6,5,3};
		System.out.println("Unsorted Array: "+ Arrays.toString(arr));
		int ans[]= mergeSort(arr);
		System.out.println("Sorted Array: "+ Arrays.toString(ans));
	}

	public static int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==1)
			return arr;
		int start= 0;
		int end= arr.length;
		
		int mid= start+(end-start)/2;
		
//		comments for checking the flow of code in recursive pattern
//		System.out.println("left " + start+ " "+ mid +" ");
		int[] left= mergeSort(Arrays.copyOfRange(arr, start, mid));
//		System.out.println("left" + Arrays.toString(left));
//		System.out.println("right " + mid+" "+ end);
		int[] right= mergeSort(Arrays.copyOfRange(arr, mid, end));
//		System.out.println("right" + Arrays.toString(right));
		
		
		return merge(left, right);
	}

	public static int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int[]mix= new int[left.length+ right.length];
		int i=0, j=0, k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				mix[k++]= left[i];
				i++;
			}
			else {
				mix[k++]= right[j++];
			}
		}
		while(i<left.length) {
			mix[k++]= left[i];
			i++;
		}
		while(j<right.length) {
			mix[k++]= right[j];
			j++;
		}
//		System.out.println("mix "+ Arrays.toString(mix));
		return mix;
	}

}
