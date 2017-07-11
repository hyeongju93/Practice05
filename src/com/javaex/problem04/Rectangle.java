package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{
	private double width;
	private double height;
	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getPerimeter() {
		double sum=0;
		sum=2*(width+height);
		return sum;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public void resize(double s) {
		width=width*s;
		height=height*s;
	}

	public double getWidth() {
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

	
}
