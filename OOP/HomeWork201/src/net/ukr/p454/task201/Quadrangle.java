package net.ukr.p454.task201;

public class Quadrangle extends Shape{
	
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	private String type;
	
	
	public Quadrangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		type = "Quadrangle";
	}

	public Quadrangle() {
		super();
	}

	
	@Override
	public double getPerimeter() {
		double ab = a.getLengthSide(b);
		double bd = b.getLengthSide(d);
		double cd = c.getLengthSide(d);
		double ac = a.getLengthSide(c); 
		
		double perimeter = ab + bd + cd + ac; 
		
		return perimeter;
	}

	@Override
	public double getArea() {
		double ab = a.getLengthSide(b);
		double bd = b.getLengthSide(d);
		double cd = c.getLengthSide(d);
		double ac = a.getLengthSide(c); 
		
		double semiPerimeter = getPerimeter()/2;
		double area = Math.sqrt((semiPerimeter - ab)*(semiPerimeter - bd)*(semiPerimeter - cd)*(semiPerimeter - ac));
		
		return area;
	}

	@Override
	public String toString() {
		return "Quadrangle [a=" + a.toString() + ", b=" + b.toString() + ", c=" + c.toString() + ", d=" + d.toString() + "]";
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	public String getType() {
		return type;
	}
	
}
