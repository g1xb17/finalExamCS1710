import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
public class chapter7io {
	static PrintWriter outputWriter = null;
	static Scanner inputReader = null;
	public static void reader(File inputFile) {
		ArrayList<String> input = new ArrayList<String>();
		try {
			inputReader = new Scanner(inputFile);
			while (inputReader.hasNextLine()) {
				input.add(inputReader.nextLine());
			}
		}
		catch (FileNotFoundException E) {
			System.out.println("File not found!\n");
		}
		for (int i = 0; i < input.size(); i++) {
			System.out.printf("%s\n", input.get(i));
		}
		System.out.print("\n\n");
	}
	public static void writer(File outputFile, int lines) {
		System.out.printf("Please enter %d lines to write to %s!\n", lines, outputFile);
		String x = null;
		boolean stop = false;
		int count = 0;
		try {
			outputWriter = new PrintWriter(outputFile);
			inputReader = new Scanner(System.in);
			do {
				x = inputReader.nextLine();
				outputWriter.println(x);
				count++;
				if (count >= lines) {
					stop = true;
				}
			}
			while(!stop);
			}
		catch (FileNotFoundException E) {
			System.out.println("File not found!");
		}
		catch (NoSuchElementException E) {
			System.out.println("Incorrect Input!");
		}
		outputWriter.flush();		
	}
	public static void main(String[] args) {
		boolean stop = false;
		do {
			try {
				System.out.printf("Choose an action. Type 'input', 'output' or 'stop' to quit.\n\n");
				inputReader = new Scanner(System.in);
				inputReader.reset();
				String x = inputReader.next();
				if (x.toLowerCase().compareTo("input") == 0) {
					System.out.printf("Enter the name of the file you wish to read from.\n");
					String name = inputReader.next();
					File inputFile = new File(name);
					reader(inputFile);
				}
				if (x.toLowerCase().compareTo("output") == 0) {
					System.out.printf("Enter the name of the file you wish to write to.\n");
					String name = inputReader.next();
					File outputFile = new File(name);
					System.out.printf("Please enter the amount of lines you wish to write to the file named %s.\n", outputFile);
					int lines = inputReader.nextInt();
					writer(outputFile, lines);
				}	
				if (x.toLowerCase().compareTo("stop") == 0) {
					stop = true;
					System.out.println("Good bye;"); 
					if (inputReader != null) {
						inputReader.close(); 
					}
					if (outputWriter != null) {
						outputWriter.flush();
						outputWriter.close(); 
					}
					System.exit(1);
				}
			}
			catch (NoSuchElementException E) {
				System.out.println("Invalid filename.");
			}
		}
		while (!stop);
	}
}
