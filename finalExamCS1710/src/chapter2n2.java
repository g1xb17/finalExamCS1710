import java.util.ArrayList;
import java.util.Scanner;
public class chapter2n2 {
	public static String arrayPrinter(ArrayList<String> arrayX) {
		String array = "";
		for (int i = 0; i < arrayX.size(); i++) {
			if (i == 0) { array = array + "[" + arrayX.get(i) + ", "; }
			else if (i > 0 && i < arrayX.size()-1) { array = array + arrayX.get(i) + ", "; }
			else { array = array + arrayX.get(i) + "]"; }
		}
		return array;
	}
	public static void main (String[] args) {
		byte a;
		short b;
		int c;
		long d;
		float e = 10/3; System.out.println((e / 3.5));
		double f;
		String g = "This is a string datatype!";
		String word = null;
		char[] x = {'a','b','c','d'};
		int pos1 = 0;
		int pos2 = 0;
		boolean start = false;
		boolean print = false;
/**
		ArrayList<String> tester = new ArrayList<String>();
		
		Scanner in = new Scanner(g).useDelimiter("[\\.\\!\\s] *");
		while (in.hasNext()) {
			tester.add(in.next());
		}
		System.out.println(arrayPrinter(tester));
		for (int i = 0; i < tester.size(); i++) {
			if (tester.get(i).toLowerCase().compareTo("this") == 0) {
				System.out.printf("Found match for \"%s\" in sentence.", tester.get(i));
			}
		}
		
**/	
		
		
	}
}
