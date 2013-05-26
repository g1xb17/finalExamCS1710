import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class chapter6arrays {
	public static int[] reverseSort(int[] x) {
		int[] y = new int[x.length];
		for (int i = 0; i < y.length; i++) {
			y[i] = x[(x.length - 1)-i]; 
		}
		return y;
	}
	public static void swap(int[] x,int pos1, int pos2) {
		int holder = x[pos1];
		x[pos1] = x[pos2];
		x[pos2] = holder;
	}
	public static int increment(int x) {
		x++;
		return x;
	}
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		/* Filling an array; 			Check;
		 * Sum and Average of an array; Check;
		 * Find maximum and minimum; 	Check and Check;
		 * Output with separators; 		Check;
		 * Linear search; 				Check;
		 * Removing an element;			Check;
		 * inserting an element;		Check;
		 * swapping elements;			Check;
		 * copying arrays; 				Check;
		 * Reading input; 				Check?;
		 */
		
		//Copying Arrays;
		int[] x = {1,2,3,4,5,6,7,8,9};
		int[] y = Arrays.copyOf(x, x.length * 2);
		String str = Arrays.toString(y);
	
		System.out.println(str);
		//Filling an Array with input;
		final int ARRAY_SIZE = 5;
		int[] a = new int[ARRAY_SIZE];
		System.out.printf("Please enter %d integers: \n", ARRAY_SIZE);
		for (int i = 0; i < a.length; i++) {
			try {
				
				a[i] = in.nextInt();
			}
			catch (NoSuchElementException E) {
				System.out.println("Wrong input.");
				i--; in.next();
			}
		}
		str = Arrays.toString(a);
		System.out.println(str);
		//Largest in array;
		int largest = a[0];
		int count = 1;
		
		while(count < a.length) {
			if (a[count] > largest) {
				largest = a[count];
			}
			count++;
		}
		System.out.printf("Largest in the array = %d\n", largest);		
		//Smallest in array;
		int smallest = a[0];
		count = 1;
		while (count < a.length) {
			if (a[count] < smallest) {
				smallest = a[count];
			}
			count++;
		}
		System.out.printf("Smallest in the array = %d\n", smallest);
		//Sorting arrays;
		Arrays.sort(a);
		str = Arrays.toString(a);
		System.out.println(str);
		//Reverse sorting after using Arrays.sort();
		a = reverseSort(a);
		str = Arrays.toString(a);
		System.out.println(str);
		//Linear search;
		System.out.println("Enter a value you want to try to search for in the array you just filled.");
		int find = 0;
		boolean found = false;
		while (!found) {
			try {
				find = in.nextInt();
				found = true;
			}
			catch (NoSuchElementException E) {
				System.out.println("Wrong value type!"); in.next();
			}
			
		}
		found = false;
		System.out.println("Enter a value between the smallest and largest in the array you created.");

		int pos = 0;
		
		while (pos < a.length && !found) {
			if (a[pos] == find) {
				found = true;
			}
			else {
				pos++;
			}
		}
		if (found) {
			System.out.printf("Found your value at a[%d] = %d\n", pos, a[pos]);
		}
		else { 
			System.out.printf("Could not find your value. Sorry.\n");
		}
		//Binary Search;
		Arrays.sort(a);
		found = false;
		pos = 0;
		int low = 0;
		int high = a.length-1;
		while (low <= high && !found) {
			pos = (low + high)/2;
			if (a[pos] == find) {
				found = true;
			}
			else if (a[pos] < find) {
				low = pos + 1;
			}
			else { high = pos - 1; }
		}
		if (found) {
			System.out.printf("Found at position = %d\n", pos);
		}
		else {
			System.out.printf("Could not find at any position.\n");
		}  
		//Sum and Average;
		double average;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		average = sum / a.length;
		System.out.printf("The sum = %d\nAverage = %.1f\n", sum, average);
		
		//Using separators
		for (int i = 0; i < a.length; i++){
			if (i == 0) {
				System.out.printf("[%d",a[i]);
			}
			else {
				System.out.printf(" | %d", a[i]);
			}
		}
		System.out.println("]");
		//Swap;
		swap(a, 1, 3);
		str = Arrays.toString(a);
		System.out.println(str);
		int[] original = a;
		//Insert element;
		int[] b = new int[original.length+1];
		pos = 3;
		int nu = 8;
		for (int i = 0; i <b.length; i++) {
			if (i < pos) {
				b[i] = original[i];
			}
			else if (i == pos){
				b[i] = nu;
			}
			else {
				b[i] = original[i-1];
			}
		}
		str = Arrays.toString(b);
		System.out.println(str);
		
		//Remove element;
		//1,2,3,4,5
		//0,1,2,3,4
		int[] c = new int[original.length-1];
		pos = 2;
		for (int i = 0; i < c.length+1; i++) {
			if (i < pos) {
				c[i] = original[i];
			}
			else if (i > pos) {
				c[i-1] = original[i];		
			}
		}
		str = Arrays.toString(c);
		System.out.println(str);
		//Array List Adding
		ArrayList<Integer> values = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			values.add(i*i);
		}
		//Array List Printing
		for(int i = 0; i < values.size(); i++) {
			System.out.printf("values[%d] = %d\n",i, values.get(i));
		}
		//Array List Removing
		values.remove(5);
		
		//Array List Printing
		for(int i = 0; i < values.size(); i++) {
			System.out.printf("values[%d] = %d\n",i, values.get(i));
		}
		//Array List Adding by position
		values.add(0, 100);
		
		//Array List Printing
		for(int i = 0; i < values.size(); i++) {
			System.out.printf("values[%d] = %d\n",i, values.get(i));
		}
		//Array List Swap
		int pos1 = 5;
		int pos2 = 7;
		int hold = values.get(7);
		values.set(7, values.get(5));
		values.set(5, hold);
		
		//Array List Printing
		for(int i = 0; i < values.size(); i++) {
			System.out.printf("values[%d] = %d\n",i, values.get(i));
		}
	}
}
