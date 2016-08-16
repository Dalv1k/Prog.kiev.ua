package net.ukr.p454.task201;

public class Board {
	
	Shape[] shapes = new Shape[4];
	
	public void addShape(Shape shape) {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] != null) {
				if (shapes[i].getClass() == shape.getClass()){
					System.out.println("This figure exists on board");
					break;
				}
			}else {
				shapes[i] = shape;
				break;
			}
		}
	}

	public void remShape(Shape shape)  {
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i].getClass() == shape.getClass()){
				shapes[i] = null;
				System.out.println("Figure was removed");
				break;
			}
		}
	}
	
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] == null) {
				stringBuffer.append("Free");
			}else{
				stringBuffer.append(shapes[i].toString());
			}
			stringBuffer.append(System.lineSeparator());
		}
		return stringBuffer.toString();
	}
	
	
}
