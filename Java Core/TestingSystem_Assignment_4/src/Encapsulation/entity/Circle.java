package Encapsulation.entity;

public class Circle {
	private final double PI = 3.14;
	double radius;
	String color;

	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	};

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;

	}

	public double getArea() {
		return PI * Math.pow(radius, 2.0);

	}
}