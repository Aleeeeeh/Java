package Entities;

import Entities.enums.Color;

public class retangle extends shape {
	private double width;
	private double height;
	
	public retangle() {
		super();
	}
	public retangle (Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	public double getwidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return width * height;
	}

}
