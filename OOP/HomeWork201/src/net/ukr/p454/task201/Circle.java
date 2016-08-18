package net.ukr.p454.task201;

public class Circle extends Shape{
	
	private Point a;
	private Point r; 
	private String type;
	
	public Circle(Point a, Point r) {
		super();
		this.a = a;
		this.r = r;
		type = "Circle";
	}

	public Circle() {
		super();
	};
		
	
	@Override
	public double getPerimeter() {
		
		return 2 * Math.PI * a.getLengthSide(r); 
	}

	@Override
	public double getArea() {
		
		return Math.PI * Math.pow(a.getLengthSide(r),2);
	}

	@Override
	public String toString() {
		return "Circle [centre = " + a.toString() + ", radius=" + a.getLengthSide(r) + "]";
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getR() {
		return r;
	}

	public void setR(Point r) {
		this.r = r;
	}

	public String getType() {
		return type;
	}

	
}
