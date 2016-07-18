package com.xia.draw;

import com.xia.design.*;;

public class U_I_line  extends Y_X_line{
	private Point [] array;

	public Point[] getArray() {
		return array;
	}

	public void setArray(Point[] array) {
		this.array = array;
	}
	public U_I_line(){
		
	}
	public U_I_line(Point[] array) {
		super();
		this.array = array;
	}
}
