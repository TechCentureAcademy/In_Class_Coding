package Natella_revision_class;

public class Rectangle {
	
	private int length, width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public double Perimeter(double length, double width) {
		return length*2 + width*2;
	}
	
	public double Area(double length, double width) {
		return length * width;
	}

}