public class Main {
	public static void main(String[] args) {
		System.out.println(Fact(5));
		int[] arr = {1,3,2,6,2,1,2,5,6};
		System.out.println(sumOfArr(0,arr));
		System.out.println(Fibonachi(20));
	}
	//public int Palindrom(int num) { // 123321
	//	if() {
			
	//	}
	//}


	public static int Fibonachi(int num) {
		if(num > 1) {
			return Fibonachi(num-2) + Fibonachi(num-1);
		}
		else {
			if(num==1) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}


	public static int Palindrom(int num) {
		if(num == 1) {
			return 1;
		}
		if((num % 2 != 0) && (num % 4 != 0) && (num % 6 != 0) && (num / num == 1)) {
			return num + Palindrom(num - 1);
		}
		else {
			
		}

		return 1;
	
	}


	public static int sumOfArr(int i,int[] arr) {
		if (i == (arr.length-1)) {
			return arr[i];
		}
		return arr[i] + sumOfArr(i+1, arr);
	}


	public static int Fact(int num) { // 5 = 1*2*3*4*5
		while(num >= 1) {
			return num * Fact(num-1);
		}
		return 1;
	}
}
