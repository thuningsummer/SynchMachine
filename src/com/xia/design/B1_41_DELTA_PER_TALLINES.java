package com.xia.design;

public class B1_41_DELTA_PER_TALLINES {
	public Line getLine(double id){
		
		
		if(id>=0.5&&id<1.25){
			return line1_0;
		}else if(id>=1.25&&id<1.75){
			return line1_5;
		}else if(id>=1.75&&id<2.25){
			return line2_0;
		}else if(id>=2.25&&id<2.75){
			return line2_5;
		}else if(id>=2.75&&id<3.5){
			return line3_0;
		}else{
			try {
				
				throw new Exception("无法查表");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
	
	
	
}

public B1_41_DELTA_PER_TALLINES(){
	
}
public B1_41_DELTA_PER_TALLINES(Line line1_0, Line line1_5, Line line2_0,
		Line line2_5, Line line3_0) {
	super();
	this.line1_0 = line1_0;
	this.line1_5 = line1_5;
	this.line2_0 = line2_0;
	this.line2_5 = line2_5;
	this.line3_0 = line3_0;
}

public void setLine1_0(Line line1_0) {
	this.line1_0 = line1_0;
}
public void setLine1_5(Line line1_5) {
	this.line1_5 = line1_5;
}
public void setLine2_0(Line line2_0) {
	this.line2_0 = line2_0;
}
public void setLine2_5(Line line2_5) {
	this.line2_5 = line2_5;
}
public void setLine3_0(Line line3_0) {
	this.line3_0 = line3_0;
}

public  Line  line1_0;
public  Line  line1_5;
public  Line  line2_0;
public  Line  line2_5;
public  Line  line3_0;
}
