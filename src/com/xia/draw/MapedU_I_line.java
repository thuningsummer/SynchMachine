package com.xia.draw;

public class MapedU_I_line extends MapedY_X_line{
	private MapedPoint [] array;

	public MapedPoint[] getArray() {
		return array;
	}

	public void setArray(MapedPoint[] array) {
		this.array = array;
	}

	public MapedU_I_line(MapedPoint[] array) {
		super();
		this.array = array;
	}
}
