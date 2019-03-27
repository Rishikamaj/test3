package com.newt;

public class Mapps {
	int id;
	String name;
	int marks;
	Mapps(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Mapps(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Mapps [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public void put(int i, String string, int j) {
		// TODO Auto-generated method stub
		
	}
	

}
