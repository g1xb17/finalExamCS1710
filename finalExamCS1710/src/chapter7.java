import java.util.Scanner;
import java.io.*;
public class chapter7 {
	public static int run() throws IOException {
		int x = 0;
		try {
			x = 3;
			doit();
			x = 5;
		}
		catch (NullPointerException E) {
			x += 5;
		}
		catch (RuntimeException E) {
			x += 10;
		}
		finally {
			x += 100;
		}
		x++;
		return x;
	}
	public static void doit() throws IOException {
		throw new IOException();
	}
	public static void main(String[] args) throws IOException {
		File inputFile = new File("In.txt");
		File outputFile = new File("Out.txt");
		Scanner fileIn = null;
		PrintWriter fileOut = null;
		try {
			int[] x = new int[5];
			fileIn = new Scanner(inputFile);
			fileOut = new PrintWriter(outputFile);
			for (int i = 0; i < x.length; i++) {
				x[i] = fileIn.nextInt();
			}
			
			for (int i = 0; i < x.length; i++) {
				fileOut.write(i + " = " + x[i] * 2 + "\n");
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		finally {
			fileOut.close();
			fileIn.close();
		}
		
		
		int x = run();
		System.out.println(x);
		
	}
}