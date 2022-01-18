public class BinarySearch {
	public static int binarySearch(int[] arr, int l, int r, int x) {
		if(r>=l) {
			int mid = l + (r-l) / 2;

			if(arr[mid] == x) {
				return x;
			}

			if(arr[mid] > x) {
				binarySearch(arr,l,mid-1,x);
			}
			else binarySearch(arr, mid+1,r,x);

		}
		return -1;
	}

	public static void printArr(int[] arr) {
		int n = arr.length;

		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//binarySearch bS = new binarySearch();
		int[] arr = {1,3,5,6,7,10,14,20};
		int n = arr.length;
		System.out.println(binarySearch(arr,0,n-1,6));
		printArr(arr);
	}


}
