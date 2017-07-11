package com.javaex.problem04;

public class RecTriangle extends Shape {
	private double width;
	private double height;
	
	public RecTriangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	
	public double getPerimeter() {
		double sum=0;
		double cross=Math.sqrt((width*width+height*height));
		sum=width+height+cross;
		return sum;
	}
	
	public double getArea() {
		return width*height/2;
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
