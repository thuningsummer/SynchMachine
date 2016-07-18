package com.xia.draw;

public class MapedIf_I_line extends MapedY_X_line{
	private MapedPoint [] array;

	public MapedPoint[] getArray() {
		return array;
	}

	public void setArray(MapedPoint[] array) {
		this.array = array;
	}

	public MapedIf_I_line(MapedPoint[] array) {
		super();
		this.array = array;
	}
	
}
