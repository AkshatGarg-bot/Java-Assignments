public class Circle {
	double rad;
	public Circle(double rad) {
		this.rad = rad;
	}
	public double getArea() { 
		return 3.14*rad*rad;
	}
	public double getCircumference() {
		return 2*3.14*rad;
	}
}