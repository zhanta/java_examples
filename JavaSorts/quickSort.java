import java.util.Random;

public class quickSort {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10];
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = rand.nextInt(100);
		}

		System.out.println("Before: ");
		printArray(numbers);

		quicksort(numbers,0,numbers.length-1);

		System.out.println("\nAfter: ");
		printArray(numbers);


	}

	public static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quicksort(int[] arr, int l, int r) {
		if(l>=r) {
			return;
		}
		int pivot = arr[r];

		int lP = l;
		int rP = r;

		while(l<r) {
			
			while(arr[lP] <= pivot && lP < rP ) {
				lP++;
			}
			while(arr[rP] >= pivot && lP < rP) {
				rP--;
			}
			swap(arr,lP, rP);
		}
		swap(arr,lP, r);

		quicksort(arr, l, lP-1);
		quicksort(arr, lP+1, r);

	}


	public static void swap(int[] arr, int id1, int id2) {
		int temp = arr[id1];
		arr[id1] = arr[id2];
		arr[id2] = temp;

	}
}
