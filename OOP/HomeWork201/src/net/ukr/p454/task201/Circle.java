package net.ukr.p454.task201;

public class Circle extends Shape{
	
	private Point a;
	private Point r; 
	
	public Circle(Point a, Point r) {
		super();
		this.a = a;
		this.r = r;
	}

	public Circle() {
		super();
	};
	
	public double getRadius(Point a, Point r){
		double radius;
		radius = Math.sqrt(Math.pow((a.getX() - r.getX()), 2) + Math.pow((a.getY() - r.getY()), 2));
		return radius;
	}
	
	
	@Override
	public double getPerimeter() {
		
		return 2 * Math.PI * getRadius(a, r); 
	}

	@Override
	public double getArea() {
		
		return Math.PI * Math.pow(getRadius(a, r),2);
	}

	@Override
	public String toString() {
		return "Circle [centre = " + a.toString() + ", radius=" + getRadius(a, r) + "]";
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
	
	
}
