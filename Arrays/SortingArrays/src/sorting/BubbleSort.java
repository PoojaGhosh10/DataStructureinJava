package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int [] arr, int length) {
		boolean swap= false;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]> arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,6,1,2,3};
		bubbleSort(arr, arr.length-1);
		System.out.print(Arrays.toString(arr));

	}

}
