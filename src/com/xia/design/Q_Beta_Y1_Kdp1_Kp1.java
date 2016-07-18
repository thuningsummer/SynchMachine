package com.xia.design;

public class Q_Beta_Y1_Kdp1_Kp1 {
	private Q q;
	private double beta;
	private int Y1;
	private double Kdp1;
	private double Kp1;
	
	public Q_Beta_Y1_Kdp1_Kp1(Q q,int y1, double beta,  double kdp1, double kp1) {
		super();
		this.q = q;
		this.beta = beta;
		Y1 = y1;
		Kdp1 = kdp1;
		Kp1 = kp1;
	}
	public Q getQ() {
		return q;
	}
	public void setQ(Q q) {
		this.q = q;
	}
	public double getBeta() {
		return beta;
	}
	public void setBeta(double beta) {
		this.beta = beta;
	}
	public int getY1() {
		return Y1;
	}
	public void setY1(int y1) {
		Y1 = y1;
	}
	public double getKdp1() {
		return Kdp1;
	}
	public void setKdp1(double kdp1) {
		Kdp1 = kdp1;
	}
	public double getKp1() {
		return Kp1;
	}
	public void setKp1(double kp1) {
		Kp1 = kp1;
	}
	
}
