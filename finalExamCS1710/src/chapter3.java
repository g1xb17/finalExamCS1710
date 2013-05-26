import static java.lang.System.out;
import java.util.Scanner;
public class chapter3 {
	public static String isBig(int xyz) {
		if (xyz < 0) {
			return "illegal";
		}
		else if (xyz >= 0 && xyz <= 10) {
			return "small";
		}
		else if (xyz > 10 && xyz <= 50) {
			return "medium";
		}
		else {
			return "large";
		}
	}
	public static void main(String[] args) {
/**
		try { 
			if (args[0].toLowerCase().compareTo("square") == 0) {
				Scanner in = new Scanner(System.in);
				boolean stuff = true;
				while (stuff) {
					System.out.print("Enter rectangle width = "); int x = in.nextInt();
					System.out.print("Enter rectangle length = "); int y = in.nextInt();
					rectangle rect = new rectangle(x, y);
					System.out.print("Enter a rectangle name: "); rect.setName(in.next()); System.out.println();
					System.out.printf("The perimeter of the rectangle called %s is: %d\n",rect.getName(), rect.getPerimeter());
					System.out.printf("The area of the rectangle called %s is: %d\n", rect.getName(), rect.getArea());
					System.out.printf("The rectangle is %s in size.\n", isBig(rect.getArea()));
					System.out.println("Type 'Q' to quit."); String quit = in.next();
					if (quit.toLowerCase().compareTo("q") == 0) {
						stuff = false;
					}
				}
			}
		}
		catch (Exception e) {
			System.out.println("No Args! Please run with \"Square\", \"Sphere\", \"Cube\"!");
		}
		
**/
		String tom = "1";
		String bob = "Two";
		String susan = " three";
		String alice = "four";
		if(susan.compareTo(alice)>0) System.out.println("susan is good!"); //no execution
		if(tom.compareTo(susan)<0) System.out.println("tom is better!!"); //no execution
		if(bob.compareTo(tom)>0) System.out.println("bob is the best!!!"); //Will execute
		if(alice.compareTo(bob)<0) System.out.println("alice is better than the best!!!!"); //no execution
		
		int x = 145;
		
		if (x >= 185) { System.out.println("XT"); }
		else if (x >= 170 && x < 185) { System.out.println("T"); } 
		else if (x >= 155 && x < 170) { System.out.println("M"); }
		else if (x >= 140 && x < 155) { System.out.println("S"); }
		else { System.out.println("XS"); }
		
		int i=3;
				switch (i % 3) {
				    case 0: System.out.println("zero");
				    case 1: System.out.println("one");
				    case 2: System.out.println("two");
				}
		
		
		
		
	}
}
