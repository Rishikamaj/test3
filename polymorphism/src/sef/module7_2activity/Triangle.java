package sef.module7_2activity;

import com.sun.javafx.scene.paint.GradientUtils.Point;

public abstract class  Triangle extends Shape  {
	private int base;
	private int height;
	private int area;

	public Triangle(int base, int height, Point point1,String color,int area){
		super(color, point1);
		this.base=base;
		this.height=height;
		this.area=area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public abstract double getArea(int x,int y);
	public  String toString() {
		System.out.println( " \"Triangle of base=\" + base + \" and height=\" + height + \", \" + super.toString();” ");
		return null;












	
	}}
	


