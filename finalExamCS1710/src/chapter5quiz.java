	public class chapter5quiz {
		public static void main(String[] args) {
			int i = 20;
			int b = m2(i); //20
			System.out.println(b + i);
		}

		public static int m1(int i) {
			int n = 0; //i = 1
			while (n * n <= i){//2 * 2 = 4 <= 2 

				n++; //2 = 2 + 1 = 3;

			}
			return n - 1; //3 - 1 = 2;
		}

		public static int m2(int a) { //a = 20 
			int b = 0;
			for (int n = 0; n < a; n++){ //3 < 20 = true
				int i = m1(n); System.out.printf("return[%d] = %d\n", n, i);//n = 2

				b = b + i; //0,1,3, 
				System.out.printf("     b[%d] = %d\n", n, b);
            }
			return b;
		}
}