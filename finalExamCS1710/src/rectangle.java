
class rectangle {
	private int x;
	private int y;
	private String name;


	public rectangle(int width, int length) {
		this.x = width;
		this.y = length;
		this.name = "";
	}
	public rectangle() {
		this.x = 0;
		this.y = 0;
		this.name = "";
	}

	public int getArea() {
		return (x * y);
	}
	
	public int getWidth() {
		return this.x;
	}
	
	public int getLength() {
		return this.y;
	}
	
	public int getPerimeter() {
		return ((2 * x) + (2 * y));
	}
	public String getName() {
		return this.name;
	}
	public void setWidth(int width) {
		this.x = width;
	}
	
	public void setLength(int length) {
		this.y = length;
	}
	public void setName(String Name) {
		this.name = Name;
	}

}
