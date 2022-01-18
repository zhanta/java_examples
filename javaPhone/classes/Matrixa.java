package classes;

import java.util.Set;

public class Matrixa {
    private int[][] arr;
    //private int stroki = arr[0].length;
    //private int stolbci = arr.length;

    public Matrixa() {}

    public Matrixa(int[][] arr) {
        this.arr = arr;
    }

    public void umnozheniyaNaNumber(int num) {
        for(int i = 0; i<this.arr[0].length;i++) {
            for(int j = 0;j<this.arr.length;j++) {
                this.arr[i][j] *= num;
            }
        }
    }

	public void deleniya(int num) {
		for(int i = 0;i<this.arr[0].length;i++) {
			for(int j = 0; j<this.arr.length;j++) {
				this.arr[i][j] -= num;
			}
		}
	}

	public void slozheniyaNum(int num) {
		for(int i = 0; i<this.arr[0].length;i++) {
			for(int j=0; j<this.arr.length;j++) {
				this.arr[i][j] += num;
			}
		}
	}


    public void slozheniya(Matrixa matrixa) {
        int[][] new_arr=matrixa.getArr();
        for(int i = 0; i<this.arr[0].length;i++) {
            for(int j = 0;j<this.arr.length;j++) {
                this.arr[i][j] += new_arr[i][j];
            }
        }
    }

    public void printerArr() {
        for(int i =0;i< arr[0].length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }


    //Getter and setter
    public int[][] getArr() {
        return arr;
    }
    public void setArr(int[][] arr) {
        this.arr = arr;
    }
    // public int getStolbci() {
    //     return stolbci;
    // }
    // public void setStolbci(int stolbci) {
    //     this.stolbci = stolbci;
    // }
    // public int getStroki() {
    //     return stroki;
    // }
    // public void setStroki(int stroki) {
    //     this.stroki = stroki;
    // }
}
