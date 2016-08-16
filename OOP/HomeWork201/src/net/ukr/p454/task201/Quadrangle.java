package net.ukr.p454.task201;

public class Quadrangle extends Shape{
	
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Quadrangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Quadrangle() {
		super();
	}

	private double getLengthSide(Point a, Point b) {
		double length;
		length = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
		return length;
	}
	
	
	@Override
	public double getPerimeter() {
		double ab = getLengthSide(a, b);
		double bd = getLengthSide(b, d);
		double cd = getLengthSide(c, d);
		double ac = getLengthSide(a, c); 
		
		double perimeter = ab + bd + cd + ac; 
		
		return perimeter;
	}

	@Override
	public double getArea() {
		double ab = getLengthSide(a, b);
		double bd = getLengthSide(b, d);
		double cd = getLengthSide(c, d);
		double ac = getLengthSide(a, c); 
		
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
	
	
}
