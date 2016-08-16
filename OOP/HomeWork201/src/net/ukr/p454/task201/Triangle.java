package net.ukr.p454.task201;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	@Override
	public double getPerimeter() {
		double ab = getLengthSide(a, b);
		double ac = getLengthSide(a, c);
		double bc = getLengthSide(b, c);
		return ab + ac + bc;
	}

	@Override
	public double getArea() {

		double ab = getLengthSide(a, b);
		double ac = getLengthSide(a, c);
		double bc = getLengthSide(b, c);

		double semiPerimeter = getPerimeter() / 2;
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - ab) * (semiPerimeter - ac) * (semiPerimeter - bc));
		return area;
	}

	private double getLengthSide(Point a, Point b) {
		double length;
		length = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
		return length;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a.toString() + ", b=" + b.toString() + ", c=" + c.toString() + "]";
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

}
