package com.xia.design;

public class GAMA_MATE {
	private String id;
	private double gama;
			
	public GAMA_MATE(){
		
	}
	
	public GAMA_MATE(String id, double gama) {
		super();
		this.id = id;
		this.gama = gama;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGama() {
		return gama;
	}
	public void setGama(double gama) {
		this.gama = gama;
	}
}
