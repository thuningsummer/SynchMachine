package com.xia.design;

public class Line {
	private  double id;
	private Point [] array;//1tiaoxian
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public Point[] getArray() {
		return array;
	}
	public void setArray(Point[] array) {
		this.array = array;
	}
	public Line(double id){
		this.id = id;
	}
	public Line(double id, Point[] array) {
		super();
		this.id = id;
		this.array = array;
	}
	
}
