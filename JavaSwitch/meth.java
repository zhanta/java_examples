public class meth {
	public static void main(String[] args) {
		System.out.println("int: 10+10= " + plus(10,10));
		System.out.println("int: 0.5+0.6= " + plus(0.5,0.6));
	}

	public static int plus(int x, int y) {
		return x+y;
	}
	public static double plus(double x, double y) {
		return x+y;
	}
}
