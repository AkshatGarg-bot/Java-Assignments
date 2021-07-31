public class Cylinder {
    Circle c1 ;
    double rad;
    double height;
	public Cylinder(double rad, double height) {
        this.rad = rad;
        this.height = height;
        c1 = new Circle(rad);
    }
	public double getArea() {
		// should use appropriate methods of Circle to get properties of the base circle
        return c1.getCircumference()*height + 2*c1.getArea();
    }
	public double getVolume() {
		// should use appropriate methods of Circle to get properties of the base circle
        return c1.getArea()*this.height;
    }
	
}