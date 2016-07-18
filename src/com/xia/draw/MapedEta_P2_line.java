package com.xia.draw;

public class MapedEta_P2_line extends MapedY_X_line{
	private MapedPoint [] array;

	public MapedPoint[] getArray() {
		return array;
	}

	public void setArray(MapedPoint[] array) {
		this.array = array;
	}

	public MapedEta_P2_line(MapedPoint[] array) {
		super();
		this.array = array;
	}
}
