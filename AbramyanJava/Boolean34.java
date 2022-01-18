import java.util.*;

public class Boolean34 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;
		x = in.nextInt();
		y = in.nextInt();

		int[][] arr = new int[8][8];

		for(int i = 0;i < 8;i++) {
			for(int j = 0;j<8;j++) {
				if((i+1) % 2 != 0) {
					if((j+1) % 2 == 0) {
						arr[i][j] = 0;
					}
					else {
						arr[i][j] = 1;
					}

				}
				else {
					if((j+1) % 2== 0) {
						arr[i][j] = 1;
					}
					else {
						arr[i][j] = 0;
					}
				}
			}
		}

		if(arr[x-1][y-1] == 1) {
			System.out.println("Черный");
		}
		else {
			System.out.println("Белый");
		}

		for(int i = 0;i<8;i++) {
			for(int j = 0;j<8;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
