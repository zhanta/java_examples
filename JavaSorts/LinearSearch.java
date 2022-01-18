public class LinearSearch {
	public static int linearSearch(int[] arr, int x) {
		int len = arr.length-1;
		for(int i = 0;i<len;i++) {
			if(arr[i] == x) {
				return x;
			}		
		}	
		return -1;
	}

	public static void main(String[] args){
		int[] arr = {1,2,4,3,5,6,7,9};
		System.out.println(linearSearch(arr,5));
	}
}
