
public class chapter5 {
	public static int n = 10;
	public static void printer() {
		int n = 2;
		System.out.println( n);
	}
	public static double cube(double x) {
		
		return x * x * x;
	}
	public static void main(String[] args) {
		System.out.println(n);
		printer();
		System.out.println(n);
		System.out.println(cube(n));
	}
}
