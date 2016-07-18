package com.xia.design;

public class W1_VLINES {
	private Line lineL;//zhouxiang
	private Line lineR;//jingxiang
	private Line lineFore;//
	public Line getLineL() {
		return lineL;
	}
	public void setLineL(Line lineL) {
		this.lineL = lineL;
	}
	public Line getLineR() {
		return lineR;
	}
	public void setLineR(Line lineR) {
		this.lineR = lineR;
	}
	
	public Line getLineFore() {
		return lineFore;
	}
	public void setLineFore(Line lineFore) {
		this.lineFore = lineFore;
	}
	public W1_VLINES(){
		
	}
	public W1_VLINES(Line lineL, Line lineR,Line lineFore) {
		super();
		this.lineL = lineL;
		this.lineR = lineR;
		this.lineFore=lineFore;
	}
}
