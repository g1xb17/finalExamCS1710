
public class sphere {
	static int count = 0;
	private double radius;
	private String units;
	/**
	 * Constructs sphere with radius a radius
	 * @param x - Sets the radius. sphere(double x);
	 */
	public sphere(double x) {
		this.radius = x;
		this.units = null;
		this.count++;
	}
	/**
	 * Default constructor for sphere object, sets radius to 0
	 */
	public sphere() {
		this.radius = 0;
		this.units = null;
		this.count++;
	}
	/**
	 * Constructs sphere with radius and unit of measurement
	 * @param x - Radius of the sphere
	 * @param y - Unit of measurement. Example = "km";
	 */
	public sphere(double x, String y) {
		this.radius = x;
		this.units = y;
		this.count++;
	}
	/**
	 * Change the radius of a sphere to double x
	 * @param x - Changes the current radius to something else
	 */
	public void setRadius(double x) {
		this.radius = x;
	}
	/**
	 * Returns the radius of the sphere object
	 * @return Return the current radius
	 */
	public double getRadius() {
		return this.radius;
	}
	/**
	 * Returns the surface area of the sphere object
	 * @return the surface area
	 */
	public double getSurfaceArea() {
		double SA = (4) * Math.PI * Math.pow(this.radius, 2);
		return SA;
	}
	/**
	 * Returns the volume of the sphere object
	 * @return the volume
	 */
	public double getVolume() {
		double Volume = (4/3) * Math.PI * Math.pow(this.radius, 3);
		return Volume;
	}
	/**
	 * Returns the diameter of the sphere object
	 * @return the diameter
	 */
	public double getDiameter() {
		return this.radius * 2;
	}
	/**
	 * Returns the unit of measurement
	 * @return - unit of measurement as String
	 */
	public String getUnits() {
		return this.units;
	}
	/**
	 * Returns the number of created sphere objects
	 * @return - Number of Spheres in memory as an int value
	 */
	public int numOfSpheres() {
		return this.count;
	}
}
