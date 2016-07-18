package com.xia.draw;


public class MapedPe_delta_line  extends MapedY_X_line{
	private MapedPoint [] array;

	public MapedPoint[] getArray() {
		return array;
	}

	public void setArray(MapedPoint[] array) {
		this.array = array;
	}

	public MapedPe_delta_line(MapedPoint[] array) {
		super();
		this.array = array;
	}
	
}
