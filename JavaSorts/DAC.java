public class DAC { //Divide and Conquer impletentation
	public static int DAC_max(int[] a, int index, int l) {
		int max;

		if(index >= l-2) {
			if(a[index] > a[index+1]) {
				return a[index];
			}
			else return a[index+1];
		}

		max = DAC_max(a,index+1,l);

		if(a[index] > max) {
			return a[index];
		}
		else return max;

	}
	public static int DAC_min(int[] a, int index, int l) {
		int min;

		if(index >= l-2) {
			if(a[index] > a[index+1]) {
				return a[index];
			}
			else return a[index+1];
		}

		min = DAC_min(a,index+1,l);
		if(a[index] < min) {
			return a[index];
		}
		else return min;
	}

	public static void main(String[] args) {
		int min, max;

		int[] arr = {1,5,3,9,4,7,10,2,8,12};
		max = DAC_max(arr,0,10);
		min = DAC_min(arr,0,10);

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
