public class Circle {
    private double rad;
	public Circle(double rad) {
		this.rad=rad;
    }
	public double getArea() { 
		return 3.14*this.rad*this.rad;
	}
	public double getCircumference() {
		return 2*3.14*this.rad;
	}
}

