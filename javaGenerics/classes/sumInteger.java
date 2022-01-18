import java.util.*;

public class sumInteger<T>{
	private T num1;
	private T num2;

	public sumInteger(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public T sumOfNum1() {
		return num1;
	}

	public T sumOfNum2() {
		return num2;
	}

	//GETTER AND SETTER
	public T getNum1() {
		return num1;
	}
	public T getNum2() {
		return num2;
	}
	public void setNum1(T num1) {
		this.num1 = num1;
	}
	public void setNum2(T num2) {
		this.num2 = num2;
	}

}
