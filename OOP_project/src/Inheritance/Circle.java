package Inheritance3;

public class Circle {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getPerimeter() {
		return Math.PI*2*this.radius;
	}
}