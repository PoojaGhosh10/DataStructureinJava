
public class LinearSearch {
	public static int linearSearch(int[] arr, int value) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
			return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,4,5,67,3,6};
		int value=67;
		int index= linearSearch(arr, value);
		System.out.println(index);

	}

}
