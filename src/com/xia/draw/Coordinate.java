package com.xia.draw;

public class Coordinate  {
	//物理单位
	private double Xmin;
	private double Xmax;
	private double Ymin;
	private double Ymax;
	private double deltaX;
	private double deltaY;
	public double getXmin() {
		return Xmin;
	}
	public void setXmin(double xmin) {
		Xmin = xmin;
	}
	public double getXmax() {
		return Xmax;
	}
	public void setXmax(double xmax) {
		Xmax = xmax;
	}
	public double getYmin() {
		return Ymin;
	}
	public void setYmin(double ymin) {
		Ymin = ymin;
	}
	public double getYmax() {
		return Ymax;
	}
	public void setYmax(double ymax) {
		Ymax = ymax;
	}
	public double getDeltaX() {
		return deltaX;
	}
	public void setDeltaX(double deltaX) {
		this.deltaX = deltaX;
	}
	public double getDeltaY() {
		return deltaY;
	}
	public void setDeltaY(double deltaY) {
		this.deltaY = deltaY;
	}
	public Coordinate(){
		
	}
	public Coordinate(double xmin, double xmax, double ymin, double ymax,
			double deltaX, double deltaY) {
		super();
		Xmin = xmin;
		Xmax = xmax;
		Ymin = ymin;
		Ymax = ymax;
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}
}
