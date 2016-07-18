package com.xia.design;

public class Q {
	private int b;
	private int c;
	private int d;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public Q(int b, int c, int d) {
		super();
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public boolean equals(Object o){
		Q q=(Q)o;
		if(this.getClass()!=q.getClass()){
			return false;
		}else{
			
			if(this.getB()==q.getB()&&this.getC()==q.getC()&&this.getD()==q.getD()){
				return true;
			}else{
				return false;
			}
		}
		
		
		
	}
	
}
