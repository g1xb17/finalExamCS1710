class Counter {
	private int value;
	public int getValue() {
		return this.value;
	}
	public void count() {
		value++;
	}
}
class CashRegister {
	private int itemCount;
	private double totalPrice;
	/**
	 * Adds an item to this cash register.
	 * @param price the price of this item
	 */
	public void addItem(double price) {
		this.itemCount++;
		this.totalPrice += price;
	}
	/**
	 * Gets the price of all items in the current sale.
	 * @return the total amount
	 */
	public double getTotal() {
		return this.totalPrice;
	}
	/**
	 * Get the number of items in the current sale.
	 * @return
	 */
	public int getCount() {
		return this.itemCount;
	}
	/**
	 * Clears the item count and the total.
	 */
	public void clear() {
		this.itemCount = 0;
		this.totalPrice = 0;
	}
}
public class chapter8 {

	public static void main(String[] args) {
		int value=10;
		String test = "test";
		Counter tally1 = new Counter();
		Counter tally2 = new Counter();
		System.out.println("Initial Value: " + tally1.getValue());
		tally1.count();
		System.out.println("Updated Value: " + tally1.getValue());
		System.out.println(value);
		System.out.println(getValue());
		CashRegister register1 = new CashRegister();
		System.out.println(register1.getCount());
		CashRegister register2 = new CashRegister();
		System.out.println(register2.getTotal());
		register1.addItem(1.9);
		register1.addItem(1.0);
		register2.addItem(10.0);
		System.out.println(register1.getTotal());
		System.out.println(register1.getCount());
		System.out.println(register2.getTotal());
		System.out.println(register2.getCount());
		
		sphere s1 = new sphere(12, "cm");
		sphere s2 = new sphere(s1.getRadius(), s1.getUnits());
		System.out.printf("Sphere volume = %f%s\n", s1.getVolume(), s1.getUnits());
		System.out.printf("Number of Spheres created in memory = %d\n", s2.numOfSpheres());
		System.out.printf("Number of Spheres created in memory = %d\n", s1.numOfSpheres());
		
	}
	public static int getValue() {
		return 20;
	}
}
