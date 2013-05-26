import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class chapter6arrays2 {
	/**
	 * Method for find the total of an int[] array
	 * @param x - Needs an int[] array as input
	 * @return - Returns the total value of the Array
	 */
	public static double totalOf(int[] x) {
		double total = 0;
		for (int i = 0; i < x.length; i++) {
			total = total + x[i];
		}
		return total;
	}
	public static void shift(int[] x, int shift) {
		for (int y = 0; y < shift; y++) {
		int hold = x[0];
			for (int i = 0; i < x.length; i++) {
				if (i+1 < x.length) {
					x[i] = x[i+1];
				}
			}
			x[x.length-1] = hold;
		}
	}
	public static void reverseShift(int[] x, int shift) {
		for (int y = 0; y < shift; y++) {
			int hold = x[x.length-1];
			for (int i = x.length-1; i >= 0; i--) {
				if (i-1 >= 0) {
					x[i] = x[i-1];
				}
			}
			x[0] = hold;
		}
	}
	public static double averageOf(int[] x) {
		double total = 0;
		
		for (int i = 0; i < x.length; i++) {
			total = total + x[i];
		}
		double average = total / x.length;
		return average;
	}
	public static int max(int[] x) {
		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) { max = x[i]; }
		}
		return max;
	}
	public static int min(int[] x) {
		int min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) { min = x[i]; }
		}
		return min;
	}
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		final int SIZE = 10;
		/* Filling an array; 				Check;	
		 * Shifting an array; 				Check;	
		 * Sum and Average of an array; 	Check;
		 * Find maximum and minimum; 		Check;
		 * Output with separators; 			Check;
		 * Linear search; 					Check;
		 * Removing an element;				
		 * inserting an element;		
		 * swapping elements;			
		 * copying arrays; 					
		 * Reading input;					Check; 				
		 */
		
		System.out.printf("Enter %d integers: \n", SIZE);
		int[] values = new int[SIZE];
		for (int i = 0; i < values.length; i++) {
			String value = null;
			try {
				value = String.valueOf(in.next());
				values[i] = Integer.parseInt(value);
			}
			catch (NumberFormatException E) {
				System.out.printf("%s is an invalid input!", value); 
				in.next(); 
				i--;
			}
		}

		System.out.println(Arrays.toString(values));
		System.out.printf("The average of the values in the array is %.2f\nThe sum of the values in the array is %.2f\n", averageOf(values), totalOf(values));
		reverseShift(values, 3);
		System.out.println(Arrays.toString(values));
		shift(values,3);
		System.out.println(Arrays.toString(values));
		System.out.printf("The minimum value in the array is %d\n", min(values));
		System.out.printf("The maximum value in the array is %d\n", max(values));
		
		int[] valuesNew = Arrays.copyOf(values, values.length * 2);
		int count = 0;
		for (int e : valuesNew) {
			if (!(count > valuesNew.length-1)) {
				valuesNew[count] = count++;	
			}
			
		}
		System.out.println(Arrays.toString(valuesNew));
		
		int hold = valuesNew[0];
		for (int i = 0; i < valuesNew.length; i++) {
			if (i+1 < valuesNew.length) {
				valuesNew[i] = valuesNew[i+1];
			}
		}
		valuesNew[valuesNew.length-1] = hold;
		System.out.println(Arrays.toString(valuesNew));
		hold = valuesNew[valuesNew.length-1];
		for (int i = valuesNew.length-1; i >= 0; i--) {
			if (i-1 >= 0) {
				valuesNew[i] = valuesNew[i-1];
			}
		}
		valuesNew[0] = hold;
		System.out.println(Arrays.toString(valuesNew));
		
		hold = values[0];
		System.out.println(Arrays.toString(values));
		for (int i = 0; i < values.length; i++) {
			if (i+1 < values.length){
				values[i] = values[i+1];
			}
		}
		values[values.length-1] = hold;
		System.out.println(Arrays.toString(values));
		
		hold = values[values.length-1];
		for (int i = values.length-1; i >= 0; i--) {
			if (i-1 >= 0) {
				values[i] = values[i-1];
			}
		}
		
		values[0] = hold;
		System.out.println(Arrays.toString(values));
		
		ArrayList<Integer> valuesList = new ArrayList<Integer>();
		
		for (int i = 0; i < values.length; i++) {
			valuesList.add(values[i]);
			System.out.printf("valuesList[%d] = %d\n", i, valuesList.get(i));
		}
		
		
		for (int i = 0; i < valuesList.size()-1; i++) {
			valuesList.add(valuesList.remove(0));
		}
		for (int i = 0; i < values.length; i++) {
			System.out.printf("valuesList[%d] = %d\n", i, valuesList.get(i));
		}
		System.out.println("\n\n");
		int x = 0;
		while(x++ < 2) {
			for (int i = valuesList.size()-1; i > 0; i--) {
				valuesList.add(0, valuesList.remove(valuesList.size()-1));
			}
			for (int i = 0; i < valuesList.size(); i++) {

				System.out.printf("valuesList[%d] = %d\n", i, valuesList.get(i));
			}
			System.out.println("\n\n");
		}
	}
}
