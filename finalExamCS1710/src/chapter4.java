import java.util.Scanner;


public class chapter4 {
	public static void main(String [] args) {
		
		System.out.println();
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int x = 4; x >= 0; x--) {
			for (int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<4;i++) //i = 1, i < 4; 1, 2, 3
		    for (int j=4; j>0; j--) //j = 4, j > 0; 4,3,2,1
		        if ((i+j)%2 == 0) 
		           System.out.print("a");
		        else 
		            System.out.print("b");
		//babaababbaba
		//babaababbaba
		int z=0; //4
		do {
		    int j =1;//1
		    do {
		        System.out.print("a");
		        j++;
		    }
		    while(j < z); // 2 < 4
		    System.out.println();
		    z++; 
		}
		while (z < 5); //1
		//a
		//a
		//a
		//aa
		//aaa
		
		double balance=100; 
		int years =3;
		while (years-- > 0);{
		    double interest=balance*0.1; //10
		    balance=balance+interest; //110
		}
		System.out.println(balance); //110
		
		Scanner in = new Scanner(System.in);
		int x;
		boolean stop = false;
		while (!stop) {
			if (in.hasNextInt()) {
				x = in.nextInt();
				if (x >= 0 && x <= 100) {
					stop = true;
				}
				else {
					in.next();
				}
			}
			else {
				in.next();
			}
		}
		
		final int COLUMNS = 4;
		final int ROWS = 4;
		for (int i = 1; i <= ROWS; i++) {
			for (int j = COLUMNS; j > 0; j--) {
				System.out.printf("(%d,%d)", i, j);
			}
			System.out.println();
		}
		              // 0,1,2
		int[][] xyz = { {1,2,3},//0 
						{2,3,1},//1 
						{3,1,2} //2
						};       
		
		System.out.println(xyz[1][2]);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		for (int i = 4; i > 0; i--) {
			for (int j = 4 - i; j >= 0; j--) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 4; i++) {		//0,1,2,3,4
			for (int j = 0; j < i; j++) {	//0 < 0 = FALSE;
				System.out.print("X" + i+j);
			}
			System.out.println();
		}
		in = new Scanner(System.in);
		
		//1 2 2 2 8 7 7
		int currentInput = in.nextInt();
		int count = 1;
		while (in.hasNextInt()) {
			int previous = currentInput;
			currentInput = in.nextInt();
			if (previous == currentInput) {
				count++;
			} 
			else if (count > 1) {
				System.out.printf("%d appears %d times", previous, count);
				count = 1;
			}
		}
	}
}
