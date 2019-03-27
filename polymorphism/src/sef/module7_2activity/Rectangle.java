package sef.module7_2activity;

import com.sun.javafx.scene.paint.GradientUtils.Point;

public abstract class Rectangle extends Shape {
	private int width;
	private int height;
	//private int area;
	public Rectangle(String color,int width,int height,Point point1) {
		super(color,point1);

		this.width=width;
		this.height=height;
	//	this.area=area;

	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public  double getArea(int x,int y) {
		return( height*width);
	}
	public  String toString() {
		 return "Rectangle of length=\" + + \" and width=\" + width + \", \" + super.toString();"
		




	}}
