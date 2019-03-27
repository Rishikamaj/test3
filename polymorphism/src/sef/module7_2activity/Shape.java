package sef.module7_2activity;

import com.sun.javafx.scene.paint.GradientUtils.Point;

public abstract class Shape{
	private String color;
	private Point point1;

	public Shape(String color,Point point1){
		this.color=color;
		this.point1=point1;}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public abstract double getArea(int x,int y);
	public  String toString() {
		return "Shape[ Color=\\\"\" + color + \"\\\"\" + \" and coordinates \" + point1.getXCoordinate()+\", \"+point1.getYCoordinate();” \r\n" + 
				"]:" +color;
	}}


