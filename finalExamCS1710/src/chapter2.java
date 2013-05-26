import java.awt.Component;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import static java.lang.System.out;
public class chapter2 { 	
	public static int rand(int y) {
		int x = (int) Math.floor(1+Math.random()*y); //PEDMAS; Parenthesis then Exponents, Division then Multiplication, etc.
		int a;	
		return x;
	}
	public static void main(String[] args) {
		System.out.print("Program continues.");
		System.out.println();
		
		double abc = 15.9 % 5.0; System.out.println(abc);
		int result = 7 / 4; System.out.println(result);
		int result1 = 7 % 4; System.out.println(result1);
		System.out.println("Test " + 7.0 * 2.7);
		int a = (int) Math.round(5.8);
		int s = 5;
		System.out.println(++s * --s);
		System.out.println(s);
		System.out.println("1".compareTo("C"));
		String x = " ";
		String y = "";
		if (x.compareTo(y) < 0) {
			System.out.printf("%s comes before %s\n", x, y);
			System.out.printf("x.compareTo(y) = %d\n", x.compareTo(y));
		}
		else {
			System.out.printf("%s comes after %s\n", x, y);
			System.out.printf("x.compareTo(y) = %d\n", x.compareTo(y));
		}
		//Higher value on the left, Positive outcome.
		//Lower value on the left, Negative outcome.
		//Higher value on the right, Negative outcome.
		//Lower value on the right, Positive outcome.
		//Numbers come before uppercase and lowercase letters, uppercase letters come before lowercase letters
		int z = rand(9);
		switch (z) {
			case 1: System.out.println("Small"); break;
			case 2: System.out.println("Small"); break;
			case 3: System.out.println("Small"); break;
			case 4: System.out.println("Medium"); break;
			case 5: System.out.println("Medium"); break;
			case 6: System.out.println("Medium"); break;
			case 7: System.out.println("Large"); break;
			case 8: System.out.println("Large"); break;
			case 9: System.out.println("Large"); break;
			default: System.out.println("dicks"); break;
		}
		
/**		
		Scanner scn = new Scanner(System.in);
		String lastname = scn.next();
		long accountnumber = scn.nextLong();
		int age = scn.nextInt();
		double depositamount = scn.nextDouble();
		System.out.printf("%20s", lastname);
		System.out.printf("%15d", accountnumber);
		System.out.printf("%5d", age);
		System.out.printf("%10.2f", depositamount);
**/		
		String str = "The quick brown fox jumps over the lazy dog";
	//                0123456789012345678901234567890123456789012
		String str2 = str.substring(10,11) + str.subSequence(5,6) + str.substring(42, 43) + str.substring(24,25);
		System.out.println(str2);
		

	}
}
