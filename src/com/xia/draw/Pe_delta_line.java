package com.xia.draw;

import com.xia.design.*;

public class Pe_delta_line extends Y_X_line {
	private Point [] array;
	
	
	public Point[] getArray() {
		return array;
	}
	public void setArray(Point[] array) {
		this.array = array;
	}
	public Pe_delta_line(){
		
	}
	public Pe_delta_line(Point[] array) {
		super();
		this.array = array;
	}
}
