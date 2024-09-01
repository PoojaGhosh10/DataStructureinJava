
public class BinarySearch {
	public static int binarySearch(int[] arr, int value) {
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]==value) {
				return mid;
			}
			else if(arr[mid]>value) {
				end= mid-1;
				
			}
			else {
				start=mid+1;
			}
		}
		return -1;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,4,5,6,7};
		int value=6;
		int index= binarySearch(arr, value);
		System.out.println("The index at value is:" + index);
	}

}
