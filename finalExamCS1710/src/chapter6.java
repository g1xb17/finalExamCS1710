import java.util.Arrays;
import java.util.ArrayList;
public class chapter6 {
	public static String arrayPrinter(ArrayList<Integer> arrayX) {
		String array = "";
		for (int i = 0; i < arrayX.size(); i++) {
			if (i == 0) { array = array + "[" + arrayX.get(i) + ", "; }
			else if (i > 0 && i < arrayX.size()-1) { array = array + arrayX.get(i) + ", "; }
			else { array = array + arrayX.get(i) + "]"; }
		}
		return array;
	}
	public static int[] remover(int[] x, int size, int pos) {
		int[] removed = new int[size]; 
		
		for (int i = 0; i < x.length; i++) {
			if (i < pos) {
				removed[i] = x[i];
			}
			else if (i > pos) {
				removed[i-1] = x[i];
			}
		}
		return removed;
	}
	public static void main(String[] args) {
		int[] x = new int[10];
		ArrayList<Integer> y = new ArrayList<Integer>();
		

		
		for (int i = 0; i < x.length; i++) {
			x[i] = i * i;
		}
		System.out.println(Arrays.toString(x));
		x = remover(x, x.length-1, 5);
		System.out.println(Arrays.toString(x));
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			y.add((i*i));
		}
		System.out.println(arrayPrinter(y));
		y.remove(5);
		System.out.println(arrayPrinter(y));
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(4);
		values.add(3);
		values.add(2);
		values.add(1);
		ArrayList<Integer> values2 = new ArrayList<Integer>(values);
		for (int i = 0; i < values2.size(); i++) {
			System.out.printf("values2[%d] = %d\n", i, values2.get(i));
		}
		for (int i = 0; i < values.size(); i++) {
			System.out.printf("values[%d] = %d\n", i, values.get(i));
		}
	}
}
