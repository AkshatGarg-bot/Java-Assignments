public class Cylinder extends Circle{
	double radius;
	double height;
	//Circle c1;
	public Cylinder(double rad, double height) {
		super(rad);
		this.height = height;
		//this.radius = radius;
	}
	public double getArea() {
		// should use appropriate methods of Circle to get properties of the base circle
		return 2*super.getArea()+super.getCircumference()*this.height;
	}
	public double getVolume() {
		// should use appropriate methods of Circle to get properties of the base circle
		return super.getArea()*height;
	}
}