package net.ukr.p454.task201;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point aPoint = new Point(0, 0);
		Point bPoint = new Point(2, 1);
		Point cPoint = new Point(2, 3);
		Point dPoint = new Point(5, 1);
		
		Triangle triangle = new Triangle(aPoint, bPoint, cPoint);		
		
		Circle circle = new Circle(aPoint, dPoint);
		
		Quadrangle quadrangle = new Quadrangle(aPoint,bPoint,cPoint,dPoint);
		
		Board board  = new Board();
		board.addShape(triangle);
		board.addShape(circle);
		board.addShape(quadrangle);
				
		System.out.println(board.toString());
		
		board.remShape(quadrangle);
		System.out.println(board.toString());
	}

}
