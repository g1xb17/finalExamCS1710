public class BankAccount {
	private String name; // default constructor will set to null
	public void showStrings(){	
		String localName = null;
		System.out.println(name.length());
		System.out.println(localName.length());
	}
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.showStrings();
	}
}
