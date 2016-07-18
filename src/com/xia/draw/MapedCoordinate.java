package com.xia.draw;

public class MapedCoordinate  {
	
	//µ¥Î» ÏñËØ
	private int Xmin;
	private int Xmax;
	private int Ymin;
	private int Ymax;
	private int deltaX;
	private int deltaY;
	public MapedCoordinate(){
		
	}
	public MapedCoordinate(int xmin, int xmax, int ymin, int ymax, int deltaX,
			int deltaY) {
		super();
		Xmin = xmin;
		Xmax = xmax;
		Ymin = ymin;
		Ymax = ymax;
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}
	public int getXmin() {
		return Xmin;
	}
	public void setXmin(int xmin) {
		Xmin = xmin;
	}
	public int getXmax() {
		return Xmax;
	}
	public void setXmax(int xmax) {
		Xmax = xmax;
	}
	public int getYmin() {
		return Ymin;
	}
	public void setYmin(int ymin) {
		Ymin = ymin;
	}
	public int getYmax() {
		return Ymax;
	}
	public void setYmax(int ymax) {
		Ymax = ymax;
	}
	public int getDeltaX() {
		return deltaX;
	}
	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}
	public int getDeltaY() {
		return deltaY;
	}
	public void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}
}
